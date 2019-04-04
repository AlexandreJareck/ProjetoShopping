package br.edu.ctup.view;

import java.util.Scanner;

import br.edu.ctup.controller.ControllerJogador;
import br.edu.ctup.controller.ControllerJogo;
import br.edu.ctup.model.Jogador;


public class ViewJogador {
	
	static ControllerJogador controllerJogador = new ControllerJogador();
	static ControllerJogo controllerJogo = new ControllerJogo();
	static ViewJogo viewJogo = new ViewJogo();
	static Jogador player;
	static Scanner sc = new Scanner(System.in);
	
		public void cadastrarPlayer() {
		
			player = new Jogador();
			System.out.printf("Digite seu nome: ");
			player.setNomeJogador(sc.next());
			System.out.println();
			System.out.printf("Digite seu cpf: ");
			player.setCpf(sc.nextInt());
			System.out.println();
			System.out.printf("Digite seu login: ");
			player.setLogin(sc.next());
			System.out.println();
			System.out.printf("Digite sua senha: ");
			player.setSenha(sc.next());
			System.out.println();
			
			controllerJogador.cadastrarPlayer(player);
			
			System.out.println();
		}
		
		public void logarPlayer() {
			System.out.printf("Digite seu login: ");
			String login = sc.next();
			System.out.println();
			System.out.printf("Digite sua senha: ");
			String senha = sc.next();
			System.out.println();
			
			int indice = controllerJogador.autenticarPlayer(login, senha);
			if(indice>-1) {
				System.out.println("Login efetuado com sucesso!!");
				System.out.println();
				
				menuJogador(indice);
			}else {
				System.out.println("Login ou senha invalida!");
			}
		}
		
		public void menuJogador(int indice) {
			int opcao;
			do {
				player = new Jogador();
				System.out.println("1 - Comprar Jogo");
				System.out.println("2 - Lista de jogos");
				System.out.println("3 - Buscar jogo por nome");
				System.out.println("4 - Alterar seus dados");
				System.out.println("5 - Sair");
				System.out.printf("Digite sua opção: ");
				opcao = sc.nextInt();
				System.out.println();
				
				if(opcao == 1) {
					
					viewJogo.comprarJogo();
					
				}
				else if(opcao == 2) {
					
					
					viewJogo.listarJogos();
					
					
				}
				else if(opcao ==3) {
					
					viewJogo.buscarJogo();
					
				}
				
				else if(opcao ==4) { // ALTERAR DADOS
					
					System.out.printf("Novo nome: ");
					player.setNomeJogador(sc.next());
					System.out.println();
				
					System.out.printf("Nova senha: ");
					player.setSenha(sc.next());
					System.out.println();
					
					controllerJogador.alterarJogador(indice, player);
					
				}
				else {
					
				}
			}while(opcao>0 && opcao<5);	
			
		}
		public void menuPrincipal() {
			System.out.println("1 - Cadastrar Jogador");
			System.out.println("2 - Logar");
			System.out.println("3 - Mostrar todos Jogadores");
			System.out.println("4 - Cadastrar games");			
			System.out.println("5 - Sair");
			System.out.printf("Digite sua opção: ");
			
		}
		
		public void listarJogador() {
			for(Jogador player : controllerJogador.listarJogador()) {
				System.out.println("Nome: "+ player.getNomeJogador());
				System.out.println("CPF: "+ player.getCpf());
				System.out.println("Login: "+ player.getLogin());
				System.out.println();
				
			}
			
		}
	
	

}
