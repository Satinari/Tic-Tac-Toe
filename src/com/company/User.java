package com.company;

import java.util.Scanner;

public class User {

    public int show() { //fixme change method name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете ячейку 1-9 ");
        int number = scanner.nextInt();

        return number;
    }
}
