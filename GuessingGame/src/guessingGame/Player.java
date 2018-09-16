package guessingGame;

import java.util.Scanner;

public class Player
{	
	int number;
	String playerInput;
	boolean playerWin;
	int playerGuess;
	Player[] players = new Player[100];
	int playersCreated;	
	
	public void guess()
	{
		Scanner playerGuess = new Scanner(System.in);
		playerInput = playerGuess.next();
		number = Integer.parseInt(playerInput);
		this.playerGuess = number;
		System.out.println("I'm guessing " + number);
	}
	
	public void createPlayer()
	{
		players[playersCreated++] = new Player();
	}
	
	
	public void win(boolean win)
	{		
		this.playerWin = win;		
	}
	
	public boolean didPlayerWin()
	{
		return this.playerWin;
	}
	
	public int playersGuess()
	{
		return this.playerGuess;
	}
}
