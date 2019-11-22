package com.company;


import java.util.Random;

public class AI {

    // Generate random value on display for AI
    public int showAi(){
        Random rnd = new Random(System.currentTimeMillis());
        int number = rnd.nextInt(8);
        return number;
    }
}
