package guessingGame;
	
public class GuessGame
{
	Player player;	
	int numOfPlayers;	
	int winner = -1;	
	
	public void startGame(int numOfPlayers)
	{
		
		int numberToGuess = (int) (Math.random() * 10);
		System.out.println("Guess between 0 and 9");
		System.out.println(numberToGuess);
		
		
		this.numOfPlayers = numOfPlayers;
		Player player = new Player();
		for(int i = 0; i < numOfPlayers; i++) 
		{			
			player.createPlayer();	
			player.guess();			
			if(player.playersGuess() == numberToGuess) 
			{				
				player.win(true);
				winner = i+1;
			}

			
		}
		
		System.out.println("The generated number was " + numberToGuess);
	
		//Checks who the winner is. If the number is -1 then no one won
		if(winner == -1) 
		{
			System.out.println("No one won!");
		}
		else
		{
			System.out.println("Player " + winner + " won!");
		}
	
		
	}
}
