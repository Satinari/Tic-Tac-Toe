package com.company;

public class GameState {
    private final String win = "You are Win!!!";
    private final String lose = "You are Lose hahaha!!!";

    Moves moves = new Moves();

    public void stateOfGame(char value, char[][] array){ 
        if  ((array[0][0] == value && array[0][1]  == value && array[0][2] == value) ||
             (array[1][0] == value && array[1][1]  == value && array[1][2] == value) ||
             (array[2][0] == value && array[2][1]  == value && array[2][2] == value)){
            if (value == moves.x) {
                System.out.println(win);
            }
            else {
                System.out.println(lose);
            }
            System.exit(0);
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

        if  ((array[0][0] == value && array[1][0]  == value && array[2][0] == value) ||
             (array[0][1] == value && array[1][1]  == value && array[2][1] == value) ||
             (array[0][2] == value && array[1][2]  == value && array[2][2] == value)){
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
