package br.edu.ctup.view;

import java.util.Scanner;

import br.edu.ctup.controller.ControllerJogador;
import br.edu.ctup.model.Jogador;

public class ViewJogador {
	
	static ControllerJogador controllerJogador = new ControllerJogador();
	static Jogador player;
	static Scanner sc = new Scanner(System.in);
	
		public void cadastrarPlayer() {
		
			player = new Jogador();
			System.out.println("Digite seu nome");
			player.setNomeJogador(sc.next());
			System.out.println("Digite seu cpf: ");
			player.setCpf(sc.nextInt());
			System.out.println("Digite login");
			player.setLogin(sc.next());
			System.out.println("Digite senha");
			player.setSenha(sc.next());
			
			controllerJogador.cadastrarPlayer(player);
		}
		
		public void logarPlayer() {
			System.out.println("Digite seu login");
			String login = sc.next();
			System.out.println("Digite sua senha");
			String senha = sc.next();
			
			int indice = controllerJogador.autenticarPlayer(login, senha);
			if(indice>-1) {
				System.out.println("LOGIN OK!");
				menuJogador(indice);
			}else {
				System.out.println("LOGIN NÃO OK!");
			}
		}
		
		public void menuJogador(int indice) {
			System.out.println("1 - Comprar Jogo");
			System.out.println("2 - Alterar seus dados");
			System.out.println("3 - Sair");
			System.out.printf("Digite sua opção: ");
			int opcao = sc.nextInt();
			System.out.println();
			
			if(opcao == 1) {
				
			}
			else if(opcao ==2) {
				
				System.out.println("Novo nome: ");
				player.setNomeJogador(sc.next());
			
				System.out.println("Nova senha: ");
				player.setSenha(sc.next());
				
				controllerJogador.alterarJogador(indice, player);
				
			}
			
		}
	
	

}
