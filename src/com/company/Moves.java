package com.company;

import java.util.Random;

public class Moves {
    Random rnd = new Random();
    private final char empty = '_';
    char x = 'X';
    private final char o = 'O';
    boolean isPlayerMove;

    public void makeSomeMove(int choice, char[][] array) {

        // Choice <= 3
        if (choice <= 3) {
            if (array[0][choice - 1] == empty){
                if (isPlayerMove) array[0][choice - 1] = x;
                else array[0][choice - 1] = o;
            } else if (isPlayerMove) System.out.println("Выберите другое число");
            else {
                while (array[0][choice - 1] != empty && choice != 0){
                    choice = rnd.nextInt(8);
                }
                array[0][choice - 1] = o;
            }
        }

        // Choice <= 6
        else if (choice <=6){
            if (array[1][choice - 4] == empty){
                if (isPlayerMove) array[1][choice - 4] = x;
                else array[1][choice - 4] = o;
            } else if (isPlayerMove) System.out.println("Выберите другое число");
            else {
                while (array[1][choice - 4] != empty && choice != 0){
                    choice = rnd.nextInt(8);
                }
                array[1][choice - 4] = o;
            }
        }

        // Choice <= 9
        else if (choice <=9) {
            if (array[2][choice - 7] == empty){
                if (isPlayerMove) array[2][choice - 7] = x;
                else array[2][choice - 7] = o;
            } else if (isPlayerMove) System.out.println("Выберите другое число");
            else {
                while (array[2][choice - 7] != empty && choice != 0){
                    choice = rnd.nextInt(8);
                }
                array[2][choice - 7] = o;
            }
        }
    }

    public void changeMove(){
        isPlayerMove = !isPlayerMove;
    }

}
