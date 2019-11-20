package com.company;

public class Field {
    int i;
    char[] v = new char[9];


    public void display(){

        System.out.println("|_" + v[0] + "_|" +
                            "_" + v[1] + "_|" +
                            "_" + v[2] + "_|\n" +
                           "|_" + v[3] + "_|" +
                            "_" + v[4] + "_|" +
                            "_" + v[5] + "_|\n" +
                           "|_" + v[6] + "_|" +
                            "_" + v[7] + "_|" +
                            "_" + v[8] + "_|\n" );

    }

    public void clear(){
        for ( i = 0; i < 9; i++) {
            v[i] = '_';
        }

    }
}
