package br.edu.ctup.view;

import java.util.Locale;
import java.util.Scanner;

import br.edu.ctup.controller.Calculator;

public class Principal {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double circum= Calculator.circumference(radius);
		
		double vol = Calculator.volume(radius);
		
		System.out.println("Circumference: "+ circum);
		
		System.out.println("Volume : "+ vol);
		
		System.out.println("PI VALUE: " + Calculator.PI);
		
		
		
		
	}

}
