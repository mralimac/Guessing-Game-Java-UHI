package guessingGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Player
{	
	int number;	
	int playerGuess;
	Scanner playersInput;
	ArrayList<Player> players = new ArrayList<Player>();
	int playersCreated;	
	
	//This method is called when the "GuessGame" class needs the player to input a guess 
	public int guess(int playerNum)
	{
		//A guess is created and stored by a Scanner which reads the player's input into console
		//and stores it in the int variable "playersGuess"
		this.playersInput = new Scanner(System.in);
		System.out.println("Player " + playerNum + " - What number do you guess?");
		while(true)
		{
			//This try-catch loop inside this while loop is for error checking
			//If the player attempts to enter a non-int like "h" then the program will catch
			//that and ask the player to guess again. It will refuse to contiune until a valid
			//answer is created
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
	
	//This method is used to create players
	//It does this by adding 1 to the total player count "playersCreated"
	//And then it adds the players to the ArrayList
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
