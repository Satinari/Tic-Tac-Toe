package com.company;

public class Moves {
    boolean player;


    public void makeSomeMoves (int choice, char[] v){

        player = !player;
        choice -= 1;
        if (player == true){
            v[choice] = 'X';
        } else {
            v[choice] = 'O';
        }
    }
}
