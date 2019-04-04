package br.edu.ctup.model;

import java.security.SecureRandom;

public class Craps {
	
	public static final SecureRandom randomNumbers = new SecureRandom();
	
	public int SANKE_EYES =2;
	
	private  int SEVEN = 7;
	private  int TREY = 3;
	private  int YO_LEVEN = 11;
	private  int BOX_CARS = 12;
	
	public  int getSankeEyes() {
		return SANKE_EYES;
	}
	public int getSeven() {
		return SEVEN;
	}
	public  int getTrey() {
		return TREY;
	}
	public  int getYoLeven() {
		return YO_LEVEN;
	}
	public  int getBoxCars() {
		return BOX_CARS;
	}
	
	
	

	
	public int rollDice() {
		
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		int sum = die1 + die2;
		
		System.out.printf("Player roller %d + %d = %d%n", die1, die2, sum);
		
		return sum;
		
	}
	

}

	


