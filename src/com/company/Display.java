package com.company;

public class Display {

    public void structureOfArray (char[][] array){

        // Draw game's field
        System.out.println("|_" + array[0][0] + "_|" +
                "_" + array[0][1] + "_|" +
                "_" + array[0][2] + "_|\n" +
                "|_" + array[1][0] + "_|" +
                "_" + array[1][1] + "_|" +
                "_" + array[1][2] + "_|\n" +
                "|_" + array[2][0] + "_|" +
                "_" + array[2][1] + "_|" +
                "_" + array[2][2] + "_|\n" );
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
