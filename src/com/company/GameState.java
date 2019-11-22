package com.company;

public class GameState {
    private final String win = "You are Win!!!";
    private final String lose = "You are Lose hahaha!!!";

    Moves moves = new Moves();

    // FIXME: 11/22/2019 
    public void stateOfGame(char value, char[][] array){ 
        if (array[0][0] == array[0][1] && array[0][1]  == array[0][2] && array[0][0] == value){
            if (value == moves.x) {
                System.out.println(win);
            }
            if(value == moves.o){
                System.out.println(lose);
            }
            System.exit(0);
        }

        if (array[1][0] == array[1][1] && array[1][1]  == array[1][2] && array[0][0] == value){
            if (value == moves.x) {
                System.out.println(win);
            }
            if(value == moves.o){
                System.out.println(lose);
            }
            System.exit(0);
        }

        if (array[2][0] == array[2][1] && array[2][1]  == array[2][2] && array[0][0] == value){
            if (value == moves.x) {
                System.out.println(win);
            }
            if(value == moves.o){
                System.out.println(lose);
            }
            System.exit(0);
        }
    }
}
