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
        display.drawGamesField(array);

        while (true){
            moves.changeMove();
            moves.makeSomeMove(user.receiveValueFromUser(), array);
            display.drawGamesField(array);
            gameState.stateOfGame(moves.x, array);
            System.out.println("Кампухтер ходит");
            moves.changeMove();
            moves.makeSomeMove(ai.showAi(), array);
            display.drawGamesField(array);
            gameState.stateOfGame(moves.o, array);
        }
    }
}
