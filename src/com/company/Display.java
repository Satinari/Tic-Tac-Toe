package com.company;

public class Display {

    public void drawGamesField (char[][] array) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|_" + array[i][j] + "_|");
                if (j == 2){
                    System.out.print("\n");
                }
            }
        }
    }

    // Change all empty sockets to '_'
    public void clearArray(char[][] array){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = '_';
            }
        }
    }
}
