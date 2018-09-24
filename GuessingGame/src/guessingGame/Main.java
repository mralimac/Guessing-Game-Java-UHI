package guessingGame;

public class Main
{
	

	public static void main(String[] args)
	{
		
		//Sets up the games parameters. Namely, the amount of players that are playing
		//And the difficulty setting
		InitGame initGame = new InitGame();
	
		
		//This initialises the variables required in setting up a new game. Such as the scanner
		//and number of winning players
		GuessGame game = new GuessGame();
		
		//With the game setup, this method is triggered which actually starts the whole game
		//Parameters are created and passed in through the numOfPlayers and difficulty methods
		//NumOfPlayers = Number of Players in the game
		//Difficulty = Defines what range of numbers the program will pick from
		game.startGame(initGame.numOfPlayers(), initGame.difficulty());
		while(game.playAgain())
		{	
			//This loop will ask the player on the end of each game if they wish to play again
			game.startGame(initGame.numOfPlayers(), initGame.difficulty());			
		}
		
		//If the user enters "n" for no, then the program will continue onto .closeGame
		//which will close the open Scanners and finally close the program
		
		//This had to be commented out due to it throwing an error on closing, which although it
		//closed the game, it didn't close the way I wanted
		//game.closeGame();
	}

}