package br.edu.ctup.view;


public class Principal {
	
	static ViewJogador viewJogador = new ViewJogador();

	public static void main(String[] args) {

		
		int opcao = 0;
		do {
			
			
			switch (opcao) {
			case 1:
				viewJogador.cadastrarPlayer();
				break;
			case 2:
				viewJogador.logarPlayer();
				break;

			default:
				break;
			}
			
		}while(opcao>0 && opcao<3);

	}

}
