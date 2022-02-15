package com;

public class Main {

	public static void main(String[] args) {
		
		SnakeAndLadder player1 = new SnakeAndLadder("Player1");
		SnakeAndLadder player2 = new SnakeAndLadder("Player2");
		
		String player1Name = player1.getPlayerName();
		String player2Name = player2.getPlayerName();
		
		System.out.println(player1Name + " started playing at position: " + player1.getPlayerPosition() + ".\n");
		System.out.println(player1Name + " started playing at position: " + player2.getPlayerPosition() + ".\n");
		
		
		while ( true ) {	
			
			System.out.println(player1Name + "'s turn..");
			player1.rollDice();
			System.out.println(player1Name + " reached position " + player1.getPlayerPosition() + ".\n");
			if(player1.checkWinning()) 
				break;
			
			System.out.println(player2Name + "'s turn..");
			player2.rollDice();
			System.out.println(player2Name + " reached position " + player2.getPlayerPosition() + ".\n");
			if(player2.checkWinning()) 
				break;
			
		}
		
	}

}
