package br.edu.ctup.view;

import java.util.Scanner;

public class Principal {
	
	static ViewJogador viewJogador = new ViewJogador();
	static ViewJogo viewJogo = new ViewJogo();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		
		int opcao = 0;
		do {
			
			viewJogador.menuPrincipal();
			
			opcao = sc.nextInt();
			System.out.println(); // pula linha
			switch (opcao) {
			case 1:
				viewJogador.cadastrarPlayer();
				break;
			case 2:
				viewJogador.logarPlayer();
				break;
			case 3:
				viewJogador.listarJogador();
				break;
			case 4:
				viewJogo.cadastrarJogo();
				break;
			
			

			default:
				break;
			}
			
		}while(opcao>0 && opcao<5);

	}

}
