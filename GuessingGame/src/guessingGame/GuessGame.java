package guessingGame;

import java.util.ArrayList;
import java.util.List;

public class GuessGame
{
	Player player;	
	List<Integer> winnerPlayers = new ArrayList<Integer>();
	
	public void startGame(int numOfPlayers)
	{
		
		//This Section generates the random number to guess, and asks the users for their guess
		int numberToGuess = (int) (Math.random() * 10);
		System.out.println("Guess between 0 and 9");
		System.out.println(numberToGuess);
		
		//This Section creates the players and prompts them to input their guess. It also checks if the users were correct
		//this.numOfPlayers = numOfPlayers;
		Player player = new Player();
		for(int i = 0; i < numOfPlayers; i++) 
		{			
			player.createPlayer();			
			player.guess(i+1);			
			if(player.didPlayerWin(numberToGuess)) 
			{							
				winnerPlayers.add(i+1);
			}			
		}
		
		System.out.println("The generated number was " + numberToGuess);
	
		//Checks if there was any winners and displays them. If there was no winners IE: no entrys in the list. then it skips that step
		if(winnerPlayers.size() < 1) 
		{
			System.out.println("No one won!");
		}
		else
		{
			for(int e = 0; e < winnerPlayers.size(); e++) {
				System.out.println("Player " + winnerPlayers.get(e) + " guessed correctly!");
			}
		}
		
		//Closes the input scanner to stop a leak
		player.closeScanner();
	}
}
