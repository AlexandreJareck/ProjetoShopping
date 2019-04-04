package br.edu.ctup.view;

import br.edu.ctup.model.Craps;

public class Jogo {
	private enum Status {CONTINUE, WON, LOST };
	static Craps craps = new Craps();
	public static void main(String[] args) {
		
		
		
		int myPoint =0;
		Status gameStatus;
		int sumOfDice = 0; sumOfDice = craps.rollDice();
		
		
			switch (sumOfDice) {
			case 7:
			case 11:
				gameStatus = Status.WON;
				
				break;
			case 2:
			case 3:
			case 12:
				gameStatus = Status.LOST;
				break;
	
			default:
				
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				System.out.printf("Point is %d%n", myPoint);
				break;
			}
			
		while(gameStatus ==Status.CONTINUE) {
			sumOfDice = craps.rollDice();
			
			if(sumOfDice == myPoint) {
				gameStatus = Status.WON;
			}
			
			else if(sumOfDice == craps.getSeven()) {
				gameStatus = Status.LOST;
			}
		}
		
		if(gameStatus == Status.WON) {
			System.out.println("Player Wins!!!");
		}
		else {
			System.out.println("Player Loser !!!");
		}
		
	}

}
