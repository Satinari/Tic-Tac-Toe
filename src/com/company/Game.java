package com.company;

public class Game {
    public void Start () {

        Field field = new Field();
        field.clear();
        field.display();

        User user = new User();
        user.show();

    }
}
