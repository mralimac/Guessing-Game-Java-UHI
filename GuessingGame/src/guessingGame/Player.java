package guessingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player
{	
	int number;	
	int playerGuess;
	Scanner playersInput;
	List<Player> players = new ArrayList<Player>();
	int playersCreated;	
	
	//This is the method that runs to make players take a guess
	public int guess(int playerNum)
	{
		this.playersInput = new Scanner(System.in);
		System.out.println("Player " + playerNum + " - What number do you guess?");
		while(true)
		{	
			try
			{
				number = Integer.parseInt(playersInput.next());
				this.playerGuess = number;
				System.out.println("Player " + playerNum + ": I'm guessing " + number);
				return number;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Player " + playerNum + ". This is an incorrect format.\nPlease try again");
			}
		}
	}
	
	//This method creates and adds a player to the list of players
	public void createPlayer()
	{
		playersCreated++;
		players.add(new Player());
	}
	
	//Checks if the players guess matches the randomly generated number
	public boolean didPlayerWin(int numberToGuess)
	{
		if(this.playerGuess == numberToGuess)
		{
			return true;
		}
			else
		{
			return false;
		}
	}
	
	//Closes the scanner to prevent a leak
	public void closeScanner()
	{
		this.playersInput.close();
	}
}
