package com;

public class SnakeAndLadder {
	
	private int WINNING_POSITION = 100;
	private int playerPosition = 0;
	private int numberOfDieRolls = 0;
	private int newPosition = 0;
	private String playerName = "";
	
	int getPlayerPosition() {
		return playerPosition;
	}

	int getWinningPostion() {
		return WINNING_POSITION;
	}
	
	int getNumberOfDieRolls() {
		return numberOfDieRolls;
	}
	
	SnakeAndLadder(String name){
		playerName = name;
	}
	
	String getPlayerName() {
		return playerName;
	}
	
	int rollDice() {
		int number = (int) ((Math.random() * 100) % 6) + 1;
		numberOfDieRolls += 1;
		System.out.println("Dice Value: " + number);
		newPosition = checkOptions(number);
		return newPosition;
	}
	
	
	int checkOptions(int diceValue) {
		int option = (int) ((Math.random() * 100) % 3) + 1;
		switch(option) {
		case 1:
			//ladder
			System.out.println(playerName + " took a ladder :)");
			playerPosition = playerPosition + diceValue;
			break;
		case 2:
			//snake
			System.out.println(playerName + " bitten by snake :(");
			playerPosition = playerPosition - diceValue;
			break;
		case 3:
			//no move
			System.out.println(playerName + " has no move.");
			//playerPosition = playerPosition + 0;
			break;
		}
		
		if(playerPosition < 0)
			playerPosition = 0;
		else if(playerPosition > 100)
			playerPosition = playerPosition - diceValue;
		
		if(option == 1)
			rollDice();
		
		
		return playerPosition;
	}
	
	boolean checkWinning() {
		if(getPlayerPosition() == 100) {
			System.out.println("Congragulations " + getPlayerName() + "! You finished the game ;P");
			System.out.println(getPlayerName() + " rolled the dice " + getNumberOfDieRolls() + " times to win the game.");
			return true;
		}
		return false;
	}
	
}
