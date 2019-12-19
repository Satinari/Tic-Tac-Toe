package com.company;

import java.util.Random;
public class Moves {
    Random rnd = new Random();
    private final char empty = '_';
    char x = 'X';
    char o = 'O';
    private boolean isPlayerMove;
    User user = new User();
    int choiceX;
    int choiceY;

    //Choice value for array
    public void makeSomeMove(int choice, char[][] array) {

        // If choice from User or AI <= 3
        if (choice <= 3) {
            if (array[0][choice - 1] == empty){
                if (isPlayerMove) array[0][choice - 1] = x;
                else array[0][choice - 1] = o;
            }
            else if (isPlayerMove) {
                repeatPlayerMove();
            }
            else {
                repeatAiMove(array);
            }
        }

        // If choice from User or AI <= 6
        else if (choice <=6){
            if (array[1][choice - 4] == empty){
                if (isPlayerMove) array[1][choice - 4] = x;
                else array[1][choice - 4] = o;
            } else if (isPlayerMove) {
                repeatPlayerMove();
            }
            else {
                repeatAiMove(array);
            }
        }

        // If choice from User or AI <= 9
        else if (choice <=9) {
            if (array[2][choice - 7] == empty){
                if (isPlayerMove) array[2][choice - 7] = x;
                else array[2][choice - 7] = o;
            } else if (isPlayerMove) {
                repeatPlayerMove();
            }
            else {
                repeatAiMove(array);
            }
        }
    }

    // Change choice of value for AI or User
    public void changeMove(){
        isPlayerMove = !isPlayerMove;
    }

    public void repeatAiMove(char array[][]){
        do {
            choiceX = rnd.nextInt(3);
            choiceY = rnd.nextInt(3);
        }
        while (array[choiceX][choiceY] != empty);
        array[choiceX][choiceY] = o;
    }

    public void repeatPlayerMove(){
        System.out.println("Выберите другое число");
        user.receiveValueFromUser();
        changeMove();
    }
}

