package com.company;

import java.util.Scanner;

public class User extends Field{

    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете ячейку 1-9 ");
        Field field = new Field();
        field.clear();

        field.i = scanner.nextInt();
        System.out.println(v[i] = 'X');


    }
}
