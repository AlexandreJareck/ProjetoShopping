package br.edu.ctup.view;

import javax.swing.JOptionPane;



public class Programa {
	
	public static void main(String[] args) {
		Metodos metodo = new Metodos();
		
		int opcao = 0;

		while (true) {

			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					"MENU:\n\n1. Inclusão de Livros\n"
					//+ "2. Alteração de dados\n"
					//+ "3. Exclusão de Livro\n"
					+ "2. Consultar por Livro\n"
					+ "3. Listar \n"
					+ "6. Sair\n\nDigite a opção:"));

			switch (opcao) {

			case 1:
				metodo.cadastrarLivro();
				break;
			//case 2:
				//metodo.alterar();
				//break;
			//case 3:
				//metodo.excluir();
				//break;
			case 2:
				//metodo.pesquisar();
				break;
			case 3:
				metodo.listarLivro();
				break;
			case 6:
				//metodo.sair();
				break;
			/*case 7:
				
				break;*/
			default:
				JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!", "AVISO", 1);

			}

		} // fim do while

	}

}
