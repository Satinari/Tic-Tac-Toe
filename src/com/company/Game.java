package com.company;

public class Game {
    char[][] array = new char[3][3];

    //Start game
    public void Start (){
        Display display = new Display();
        Moves moves = new Moves();
        User user = new User();
        AI ai = new AI();
        GameState gameState = new GameState();

        display.clearArray(array);
        display.structureOfArray(array);

        while (true){
            moves.changeMove();
            gameState.stateOfGame(moves.x, array);
            moves.makeSomeMove(user.receiveValueFromUser(), array);
            display.structureOfArray(array);
            System.out.println("Кампухтер ходит");
            moves.changeMove();
            gameState.stateOfGame(moves.o, array);
            moves.makeSomeMove(ai.showAi(), array);
            display.structureOfArray(array);
        }
    }
}
