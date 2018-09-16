package guessingGame;

import java.util.Scanner;

public class InitGame
{	
	int numberInputted;
	String numberInputtedStr;
	
	public int numOfPlayers()
	{		
		Scanner numOfPlayers = new Scanner(System.in);
		System.out.println("Please specify the number of players");
		numberInputtedStr = numOfPlayers.next();
		numberInputted = Integer.parseInt(numberInputtedStr);
		//numOfPlayers.close();
		return numberInputted;
	}
}
