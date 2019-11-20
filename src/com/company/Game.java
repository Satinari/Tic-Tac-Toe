package com.company;

public class Game {
    char[] v = new char[9];

    public void Start () {

        Field field = new Field();
        Moves moves = new Moves();
        User user = new User();

        field.clear(v);
        field.display(v);

        while (true){
            moves.makeSomeMoves(user.show(), v);
            field.display(v);
        }
    }
}
