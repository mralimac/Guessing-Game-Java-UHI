package guessingGame;

public class Main {
	

	public static void main(String[] args) {		
		InitGame initGame = new InitGame();
		
		GuessGame game = new GuessGame();		 
		game.startGame(initGame.numOfPlayers());
	}

}
