package com.SnakeAndLadderGame;

/*HERE GAME IS INITIATED FOR SINGLE PLAYER */

public class SnakeAndLadderGame {
	
	//PLAYER POSITION DECLARTION AND INITIALIZAION
	int playerPosition = 0;
	
	//MAIN METHOD
	public static void main(String[] args) {

		System.out.println("        welcome to Snake and Ladder Game     ");
		System.out.println("---------------------------------------------");
		System.out.println("dice is rolling to get number....");
		int diceRollResult = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("dice rolling result is- " + diceRollResult);

	}

}
