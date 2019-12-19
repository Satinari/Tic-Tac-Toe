package com.company;

public class GameState {
    private final String win = "You are Win!!!";
    private final String lose = "You are Lose hahaha!!!";

    Moves moves = new Moves();

    public void stateOfGame(char value, char[][] array){
        
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][0] != '_'){
                if (value == moves.x) {
                    System.out.println(win);
                }
                else {
                    System.out.println(lose);
                }
                System.exit(0);
            }
        }

        for (int i = 0; i < 3; i++) {
            if (array[0][i] == array[1][i] && array[1][i] == array[2][i] && array[0][i] != '_'){
                if (value == moves.x) {
                    System.out.println(win);
                }
                else {
                    System.out.println(lose);
                }
                System.exit(0);
            }
        }

        if ((array[0][0] == value && array[1][1]  == value && array[2][2] == value) ||
            (array[2][0] == value && array[1][1]  == value && array[0][2] == value)){
            if (value == moves.x) {
                System.out.println(win);
            }
            else {
                System.out.println(lose);
            }
            System.exit(0);
        }

        
    }
}
