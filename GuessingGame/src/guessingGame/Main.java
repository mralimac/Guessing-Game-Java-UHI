package guessingGame;

public class Main {
	

	public static void main(String[] args) {
		//Sets up the games parameters. Namely, the amount of players that are playing
		InitGame initGame = new InitGame();
		
		//Sets up a new game		
		GuessGame game = new GuessGame();
		
		//Starts that new game
		game.startGame(initGame.numOfPlayers());
	}

}
