package guessingGame;

import java.util.Scanner;

public class InitGame
{	
	Scanner playerInput = new Scanner(System.in);
	
	
	
	//This method asks the user for the number of players that wish to play the game	
	public int numOfPlayers()
	{		
	
		System.out.println("Please specify the number of players");		
		while(true)
		{
			//This is the same kind of try-catch loop in the GuessGame class
			//A future improvement could move this into its own method that both "GuessGame"
			//and "InitGame" can call whenever they need user input
			try
			{
				return Integer.parseInt(this.playerInput.next());				
			}
			catch(NumberFormatException e)
			{
				System.out.println("This is not a valid number.\nPlease try again");
				
			}
		}
	}
	
	
	//Asks the player what difficulty they want for the game.
	//Easy = 0 - 9
	//Medium = 0 - 18
	//Hard = 0 - 27
	//You may have noticed that it doesn't go to 10, 20 or 30 respectively, this is due to a problem
	//with the math used to generate the random number
	//A future improvement could attempt to resolve this flaw
	public int difficulty()
	{
		System.out.println("Please specify difficulty.\n1 for Easy\n2 for Medium\n3 for Hard");		
		while(true) 
		{
			//Yet Another Try-Catch loop, this is could definitely be its own method to reduce
			//the amount of copy-pasta thats going on
			//If you look at my "Aircraft Menu" program on Github, you'll see I learnt this lesson
			try
			{
				return Integer.parseInt(this.playerInput.next());
			}
			catch(NumberFormatException e)
			{
				System.out.println("This is not a valid number.\nPlease try again");
			}
		}
		
	}
	
	//Closes the input scanner to solve a leak
	public void closeScanner()
	{
		this.playerInput.close();
	}
}
