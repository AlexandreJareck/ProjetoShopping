package br.edu.ctup.view;

import java.util.Scanner;

import br.edu.ctup.controller.ControllerJogo;
import br.edu.ctup.model.Jogo;

public class ViewJogo {

	static ControllerJogo controllerJogo = new ControllerJogo();

	static Jogo jogos;
	static Scanner sc = new Scanner(System.in);
	static int encontrou;
	static int quantidade;
	static double resultTotal;
	static int qtdJogoRemove;
	static double pagamento;
	static double resultadoCompra;

	public void cadastrarJogo() {

		jogos = new Jogo();

		System.out.printf("Digite o nome do jogo: ");
		jogos.setNomeJogo(sc.next());
		System.out.println();
		System.out.printf("Digite o preço do jogo: ");
		jogos.setPreco(sc.nextDouble());
		System.out.println();
		System.out.printf("Digite a quantiade do jogo em estoque: ");
		jogos.setQuantidade(sc.nextInt());
		System.out.println();
		controllerJogo.cadastrarJogo(jogos);

	}

	public void listarJogos() {

		for (Jogo jogos : controllerJogo.listarJogos()) {

			System.out.println("Jogo: ");
			System.out.println("Nome do jogo: " + jogos.getNomeJogo());
			System.out.println("Preço do produto: " + jogos.getPreco());
			System.out.println("Quantidade em estoque: " + jogos.getQuantidade());
			System.out.println();
			
		}
	}

	public void buscarJogo() {

		System.out.printf("Digite o nome do jogo para fazer a busca: ");
		String nomeJogo = sc.next();
		System.out.println();

		encontrou = controllerJogo.buscarJogo(nomeJogo);
		if (encontrou > -1) {
			// fazer listar nomes iguais

			System.out.println(controllerJogo.listaEncontrado(encontrou));

		}

	}

	public void comprarJogo() {
		double totalJogos = 0;
		int opcao = 0;
		do {
			listarJogos();

			System.out.printf("Digite o nome do jogo que deseja comprar: ");
			String nomeJogo = sc.next();
			System.out.println();

			encontrou = controllerJogo.buscarJogo(nomeJogo);
			if(encontrou == -1) {
				System.out.println("Produto zerado em estoque ou  nome invalido;");
				System.out.println();
				if(totalJogos > 0) {
					pagamentoCompra();
				}
				break;
			}

			if (encontrou > -1) {

				System.out.println(controllerJogo.listaEncontrado(encontrou));
				System.out.printf("Informe a quantidade que deseja comprar: ");

				quantidade = sc.nextInt();
				if (quantidade <= 0) {
					System.out.println("Quantidade invalida!");
					break;
				}
				resultTotal = totalJogos + controllerJogo.somaTotal(encontrou, quantidade); // guarda a soma

				System.out.println();

				qtdJogoRemove = controllerJogo.removeQtd(encontrou, quantidade);
				if (quantidade < qtdJogoRemove) {
					System.out.println(qtdJogoRemove);
					System.out.println(quantidade);
					System.out.println("Quantidade indisponivel em estoque");
					break; // interrompe o programa, por causa da quantidade 
				}

				System.out.printf("Deseja continuar comprando ? \n\"1 - SIM  | 2 - NÃO \n");
				System.out.printf("Digite sua opção: ");
				opcao = sc.nextInt();
				if (opcao == 1) {

					totalJogos = resultTotal; 

				} else {
					
					pagamentoCompra();
					
				}
			} 
		} while (opcao != 2);
		
	} // fim da classe compra

	public void pagamentoCompra() {
		resultadoCompra = 0;

		System.out.println(controllerJogo.totalPreco(resultTotal));
		System.out.printf("Insira o valor do pagamento: ");
		pagamento = sc.nextDouble();
		resultadoCompra = controllerJogo.confirmarPagamento(pagamento, resultTotal);

		while (pagamento <= resultadoCompra) {
			System.out.println("Pagamento incompleto");
			System.out.println("Falta: " + resultadoCompra);
			resultTotal = resultadoCompra;
			System.out.printf("Insira o restante: ");

			pagamento = sc.nextDouble();

			resultadoCompra = controllerJogo.confirmarPagamento(pagamento, resultTotal);
			if (pagamento > resultadoCompra) {
				System.out.println(controllerJogo.seuTroco(resultadoCompra));
			}
		} // fim while pagamento

	} // fim PagamentoCompra
	
} // fim dos Metodos
