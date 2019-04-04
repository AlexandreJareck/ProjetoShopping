package br.edu.ctup.view;

import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import br.edu.ctup.controller.ControllerLivro;

import br.edu.ctup.model.Livros;

public class Metodos {

	
		static ControllerLivro controleLivro = new ControllerLivro();
		
		static Livros livro;
		
		
		public void cadastrarLivro() {
			livro = new Livros();
			System.out.println("Digite o nome do livro: ");
			String nomeL = JOptionPane.showInputDialog(null, "Informe o nome do Livro: ", "Register", 3);
			livro.setNomeLivro(nomeL);

			String nomeA = JOptionPane.showInputDialog(null, "Informe o nome do autor: ", "Register", 3);
			
			livro.setNomeAutor(nomeA);
			
			double price = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o preço do Livro: ", "Register", 3));
			
			livro.setPrecoLivro(price);
			
			controleLivro.cadastrarCliente(livro);

		}
		
		public void menu() {
			System.out.println("1 - Cadastrar Livro");
			System.out.println("2 - Listar Livros");
			System.out.println("3 - Buscar Livros");
			//System.out.println("4 - Alterar dados do cliente");
			//System.out.println("5 - Cadastrar Brinquedo");
			//System.out.println("6 - Listar Brinquedo");
			//System.out.println("7 - Alterar Dados do Brinquedo: ");
			//System.out.println("8 - Sair");
		}
		
		public void listarLivro() {

			String listado = "";
			
				for (Livros livro : controleLivro.listAllLivros()) {
				
					listado += 
							" - Lista de Livros:\nNome do livro: " + livro.getNomeLivro() + "\nNome do Autor: " + livro.getNomeAutor()
								+ 
								"\nPreço do Livro: "+ livro.getPrecoLivro()+ "\n\n";
				}
				 
				JTextArea area = new JTextArea(listado); 
				JScrollPane scroll = new JScrollPane(area); 
				scroll.setPreferredSize((new Dimension(400,255))); 
				JOptionPane.showMessageDialog(null,scroll);		

		}

		public void pesquisarLivro() {
			
			
		}

	

}
