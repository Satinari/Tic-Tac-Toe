package com.company;

import java.util.Random;

public class Moves {

    boolean player;

    public void makeSomeMoves(int choice, char[] v) {

        choice -= 1;

        if (v[choice] == '_') {
            if (player == true) {
                v[choice] = 'X';
            } else {
                v[choice] = 'O';
            }
        } else if (player == true) {
            System.out.println("Выбери другую ячейку :)");
        } else {
            while (v[choice] != '_'){
                Random rnd = new Random(System.currentTimeMillis());
                choice = rnd.nextInt(8);
            }
            v[choice] = 'O';
        }
    }

    public void changeMove(){
        player = !player;
    }

}
