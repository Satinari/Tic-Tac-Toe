package com.company;

import java.util.Scanner;

public class User {

    public void text() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете ячейку 1-9 ");
        int number = scanner.nextInt();

        System.out.println(number);

    }
}
