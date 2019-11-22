package com.company;

import java.util.Random;

public class Moves {

    boolean isPlayerMove;
    Random rnd  = new Random();
    public void makeSomeMoves(int choice, char[] v) { //fixme change  var name

        choice -= 1;

        if (v[choice] == '_') { //fixme make constants
            if (isPlayerMove) {
                v[choice] = 'X'; //fixme make constants
            } else {
                v[choice] = 'O';//fixme make constants
            }
        } else if (isPlayerMove) {
            System.out.println("Выбери другую ячейку :)");
        } else {
            while (v[choice] != '_'){
                choice = rnd.nextInt(8);
            }
            v[choice] = 'O';
        }
    }

    public void changeMove(){
        isPlayerMove = !isPlayerMove;
    }

}
