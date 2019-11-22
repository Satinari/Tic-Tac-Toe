package com.company;

import java.util.Scanner;

public class User {

    public int receiveValueFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбери ячейку: ");
        int number = scanner.nextInt();
        return number;
    }
}
