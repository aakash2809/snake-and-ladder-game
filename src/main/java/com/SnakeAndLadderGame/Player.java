package com.SnakeAndLadderGame;

public class Player {

	// DECLARATION AND INITIALIZATION PLAYER POSITION
	final static int WIN_POSITION = 100;
	final static int START_POSITION = 0;
	int playerPosition;
	String playerName;


	public Player(int playerPosition, String playerName) {
		super();
		this.playerPosition = playerPosition;
		this.playerName = playerName;
	}

	// LADDER METHOD
	public  void ladder(int diceRollResult) {

		if ((playerPosition + diceRollResult) > WIN_POSITION) {

			

		} else {

			playerPosition = playerPosition + diceRollResult;
			
		}
	}

	// SNAKE METHOD
	public void snake(int diceRollResult) {
				
		if ((playerPosition - diceRollResult)< START_POSITION) {

			playerPosition = START_POSITION;
			

		} else {
			playerPosition = playerPosition - diceRollResult;

			
		}
	}

	
}
