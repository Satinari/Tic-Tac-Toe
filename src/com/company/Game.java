package com.company;

public class Game {
    char[] v = new char[9];

    public void Start () {

        Field field = new Field();
        Moves moves = new Moves();
        User user = new User();
        AI ai = new AI();

        field.clear(v);
        field.display(v);

        while (true){
            moves.changeMove();
            moves.makeSomeMoves(user.show(), v);
            field.display(v);
            System.out.println("Кампухтер ходит:");
            moves.changeMove();
            moves.makeSomeMoves(ai.showAi(), v);
            field.display(v);
        }
    }
}
