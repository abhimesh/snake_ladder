package org.example;

import java.util.Random;

public class Dice {
    int number;
    Dice(int number)
    {
        this.number=number;
    }

    int genrate_random_number()
    {
        return new Random().nextInt(number)+1;
    }

}
