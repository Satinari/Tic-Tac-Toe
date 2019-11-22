package com.company;

public class Game {
    char[][] array = new char[3][3];

    public void Start (){
        Display display = new Display();
        Moves moves = new Moves();
        User user = new User();
        AI ai = new AI();

        display.clearArray(array);
        display.structureOfArray(array);

        while (true){
            moves.changeMove();
            moves.makeSomeMove(user.receiveValueFromUser(), array);
            display.structureOfArray(array);
            System.out.println("Кампухтер ходит");
            moves.changeMove();
            moves.makeSomeMove(ai.showAi(), array);
            display.structureOfArray(array);
        }
    }
}
