package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        board board=new board();
        board.addLadder(10,89);
        board.addLadder(33,74);
        board.addLadder(45,54);

        board.addsnakes(99,9);
        board.addsnakes(66,20);
        board.addsnakes(77,32);

        Dice dice=new Dice(6);
        Players players1 = new Players("Abhimesh");
        Players players2 = new Players("Rachana");

        snaker_and_ladder snakerAndLadder=new snaker_and_ladder(board,dice, players1);
        snakerAndLadder.add_player(players1);
        snakerAndLadder.add_player(players2);
        snakerAndLadder.Game();

    }
}