package guessingGame;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessGame
{
	Player player;	
	ArrayList<Integer> winnerPlayers = new ArrayList<Integer>();
	//You'll notice I use ArrayLists instead of Arrays. THis is because ArrayLists don't have a
	//locked size and they can be added (and removed) from really easily. THis makes them better
	//for storing data for non-fixed data types. Using ArrayLists also removes any (normal)
	//limit on the number of players that can be created
	
	public void startGame(int numOfPlayers, int difficulty)
	{
		System.out.println("Game has started with the following parameters:\nNumber of Players: "+ numOfPlayers + "\nDifficulty Setting: " + difficulty);
		
		//This Section generates the random number to guess, and asks the users for their guess
		int numberToGuess = (int) (Math.random() * 10 * difficulty);
		System.out.println("Guess between 0 and " + 9*difficulty);		

		
		//This Section creates the players and prompts them to input their guess. It also checks if the users were correct		
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
		//initGUI.createLabel("The generated number was " + numberToGuess);
		//Checks if there was any winners and displays them. If there was no winners IE: no entrys in the list. then it skips that step
		if(winnerPlayers.size() < 1) 
		{
			System.out.println("No one won!");
			//initGUI.createLabel("No one won!");
			
			
		}
		else
		{
			for(int e = 0; e < winnerPlayers.size(); e++) {
				System.out.println("Player " + winnerPlayers.get(e) + " guessed correctly!");
				//initGUI.createLabel("Player " + winnerPlayers.get(e) + " guessed correctly!");
			}
		}
	}
	
	public void closeGame()
	{
		//Closes scanner to stop a little leak
		player.closeScanner();		
	}
	
	//This method asks the player if they wish to play again, and then return the answer true/false
	//No try-catch loop here because most data can be a string and processed as such
	public boolean playAgain()
	{
		Scanner inputStringScanner = new Scanner(System.in);
		System.out.println("Do you wish to play again? y/n");
		if(inputStringScanner.next().equals("y"))
		{
			System.out.println("Starting new game........");
			System.out.println("*************************");
			return true;
		}
		else
		{		
			System.out.println("Exiting Program....");
			return false;			
		}
		
	}
}
