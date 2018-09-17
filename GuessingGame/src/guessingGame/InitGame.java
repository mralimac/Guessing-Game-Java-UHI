package guessingGame;

import java.util.Scanner;

public class InitGame
{	
	Scanner playerInput;	
	
	//Asks for the number of players required to play
	public int numOfPlayers()
	{		
		this.playerInput = new Scanner(System.in);
		System.out.println("Please specify the number of players");
		while(true)
		{
			//This try-catch makes sure the user is returning a valid number.
			try
			{
				return Integer.parseInt(playerInput.next());				
			}
			catch(NumberFormatException e)
			{
				System.out.println("This is not a valid number. \nPlease try again");				
			}
		}
		//return Integer.parseInt(playerInput.next());
	}
	
	//Closes the input scanner to solve a leak
	public void closeScanner()
	{
		this.playerInput.close();
	}
}
