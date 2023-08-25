package org.example;

import java.util.HashMap;

public class board {
    private HashMap<Integer,Integer> ladder;
    private HashMap<Integer,Integer> snakes;
    board()
    {
        ladder=new HashMap<Integer,Integer>();
        snakes=new HashMap<Integer,Integer>();
    }
    public void addLadder(int a,int b)
    {
        if(ladder.containsKey(a))
        {System.out.println("Ladder already present starting at index:"+a);}
        else {ladder.put(a,b);}
    }
    public void addsnakes(int a,int b){
        if(snakes.containsKey(a))
        {System.out.println("snake already present starting at index:"+a);}
        else {snakes.put(a,b);}
    }
     public boolean checkSnakes(int a)
     {
         return snakes.containsKey(a);
     }
     public boolean checkladder(int a)
     {
         return ladder.containsKey(a);
     }
     public Integer next_position(int a)
    {
        if(checkSnakes(a))
        {return snakes.get(a);}
        else if(checkladder(a))
        {return ladder.get(a);}
        else
        {return -1;}
    }
}
