package com.SnakeAndLadderGame;

/*HERE GAME IS INITIATED FOR SINGLE PLAYER */

public class SnakeAndLadderGame {

	// DECLARATION AND INITIALIZATION PLAYER POSITION
	static int playerPosition = 0;

	// LADDER METHOD
	public static int ladder(int diceRollResult) {
		playerPosition = playerPosition + diceRollResult;
		return playerPosition;
	}

	// SNAKE METHOD
	public static int snake(int diceRollResult) {
		playerPosition = playerPosition - diceRollResult;
		return playerPosition;
	}

	// MAIN METHOD
	public static void main(String[] args) {
		int currentPosition = 0;

		System.out.println("        welcome to Snake and Ladder Game     ");
		System.out.println("---------------------------------------------");

		// ITERATION TILL 100
		while (playerPosition <= 100) {

			System.out.println("dice is rolling....");
			int diceRollResult = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			System.out.println("dice rolling result is- " + diceRollResult);
			int option = (int) (Math.floor(Math.random() * 10) % 3);

			// SNAKE LADDER EVALUTION
			switch (option) {
			case 0:
				currentPosition = playerPosition;
				System.out.println("no play");
				System.out.println("updated player positon : " + currentPosition);
				break;
			case 1:
				currentPosition = ladder(diceRollResult);
				System.out.println("found ladder");
				System.out.println("updated player positon : " + currentPosition);
				break;
			case 2:
				currentPosition = snake(diceRollResult);
				System.out.println("found snake ");
				System.out.println("updated player positon : " + currentPosition);
				break;

			default:

			}

			// CHECKING WHETHER POSITION IS LESS THAN 0
			if (playerPosition < 0) {
				playerPosition = 0;
			}
		}

	}

}
