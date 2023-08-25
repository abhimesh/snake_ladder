package org.example;

import java.util.ArrayList;
import java.util.List;

public class snaker_and_ladder {
    board board;
    Dice dice;
    List<Players> players;
    Players currentPlayer;

    snaker_and_ladder(board board, Dice dice, Players currentPlayer) {
        this.board = board;
        this.dice = dice;
        players = new ArrayList<Players>();
        this.currentPlayer = currentPlayer;

    }

    public Players nextChance() {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).Name.equals(currentPlayer.Name)) {
                if (i + 1 == players.size()) {
                    return players.get(0);
                } else {
                    return players.get(i + 1);
                }
            }
        }
        System.out.println(currentPlayer.Name + " is not in list of all player");
        return null;
    }

    public boolean executeChance(Players player) {
        boolean temp=false;
        int number_on_dice = dice.genrate_random_number();
        if (number_on_dice + player.currentPosition <= 100) {
            int temporary_position = player.currentPosition = player.currentPosition + number_on_dice;
            if (board.checkladder(temporary_position) || board.checkSnakes(temporary_position)) {
                temporary_position = board.next_position(temporary_position);
                temp=true;
            }
            player.currentPosition = temporary_position;

        }
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).Name.equals(player.Name)) {
                players.set(i, player);
            }
        }
        return temp;

    }

    boolean iswin(Players player) {
        return player.currentPosition == 100;
    }

    void Game() {
        while (true) {
            while(executeChance(currentPlayer));
            if (iswin(currentPlayer)) {
                System.out.println("Congratulations! " + currentPlayer.Name + " You won the match");
                break;
            }
            currentPlayer = nextChance();
        }

    }

    void add_player(Players player)
    {
        players.add(player);
    }
}
