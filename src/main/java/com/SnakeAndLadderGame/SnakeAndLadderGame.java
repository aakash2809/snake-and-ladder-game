package com.SnakeAndLadderGame;

/*HERE SNAKE LADER GAME IS FOR TWO PLAYERS AND CAN BE PERFORM FOR MULTI PLAYERS WITH SOME MODIFICATION */

public class SnakeAndLadderGame {

	static int numberOfRolls = 0;

	// MAIN METHOD
	public static void main(String[] args) {

		int diceRollResult = 0;
		int playerMove = 1;
		Player player1 = new Player(0, "player1");
		Player player2 = new Player(0, "player2");
		Player player;

		System.out.println("        welcome to Snake and Ladder Game     ");
		System.out.println("---------------------------------------------");

		// ITERATION TILL WIN POSITION
		while (player1.playerPosition != player1.WIN_POSITION && player2.playerPosition != player2.WIN_POSITION) {

			if (playerMove % 2 == 0) {
				player = player1;
			} else {
				player = player2;
			}

			System.out.println("dice is rolling....");

			diceRollResult = (int) (Math.floor(Math.random() * 10) % 6 + 1);

			System.out.println("dice rolling result is " + diceRollResult);
			int option = (int) (Math.floor(Math.random() * 10) % 3);

			// SNAKE LADDER EVALUTION
			switch (option) {
			case 0:
				System.out.println("no play");
				System.out.println("updated " + player.playerName + " positon : " + player.playerPosition);
				break;
			case 1:
				player.ladder(diceRollResult);
				System.out.println("found ladder");
				System.out.println("updated " + player.playerName + " positon : " + player.playerPosition);
				break;
			case 2:
				player.snake(diceRollResult);
				System.out.println("found snake ");
				System.out.println("updated " + player.playerName + " positon :  " + player.playerPosition);

			default:

			}

			numberOfRolls++;
			playerMove++;
		}

		System.out.println("-----------------------------------------------------------");
		System.out.println();

		// CHECKING WHO WON THE GAME
		if (player1.playerPosition == player1.WIN_POSITION ) {
			System.out.println("Player1 won the game ");
		} else {
			System.out.println("Player2 won the game ");
		}

		System.out.println("Number of dice rolls taken to win " + numberOfRolls);

	}

}
