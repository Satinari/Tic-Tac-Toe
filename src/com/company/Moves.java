package com.company;

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

        }
    }


    public void changeMove(){
        player = !player;
    }

}
