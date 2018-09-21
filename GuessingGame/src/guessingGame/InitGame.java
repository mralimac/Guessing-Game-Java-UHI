package guessingGame;

import java.util.Scanner;

public class InitGame
{	
	Scanner playerInput = new Scanner(System.in);
	//GUI initGUI;
	//Asks for the number of players required to play
//	public void init(GUI GUI) {
//		this.initGUI = GUI;
//	}
	
	public int numOfPlayers()
	{		
	
		System.out.println("Please specify the number of players");
		//initGUI.createLabel("Please specify the number of players");
		while(true)
		{
			//This try-catch makes sure the user is returning a valid number.
			try
			{
				return Integer.parseInt(this.playerInput.next());				
			}
			catch(NumberFormatException e)
			{
				System.out.println("This is not a valid number.\nPlease try again");
				//initGUI.createLabel("This is not a valid number.\nPlease try again");
			}
		}
		//return Integer.parseInt(playerInput.next());
	}
	
	public int difficulty()
	{
		System.out.println("Please specify difficulty.\n1 for Easy\n2 for Medium\n3 for Hard");
		//initGUI.createLabel("Please specify difficulty.\\n1 for Easy\\n2 for Medium\\n3 for Hard");
		while(true) 
		{
			try
			{
				return Integer.parseInt(this.playerInput.next());
			}
			catch(NumberFormatException e)
			{
				System.out.println("This is not a valid number.\nPlease try again");
				//initGUI.createLabel("This is not a valid number.\nPlease try again");
			}
		}
		
	}
	
	//Closes the input scanner to solve a leak
	public void closeScanner()
	{
		this.playerInput.close();
	}
}
