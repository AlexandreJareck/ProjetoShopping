package br.edu.ctup.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.ctup.model.Jogo;

public class ControllerJogo {

	List<Jogo> listJogos = new ArrayList<Jogo>();

	public void cadastrarJogo(Jogo jogo) {

		listJogos.add(jogo);

	}

	public List<Jogo> listarJogos() {
		return listJogos;
	}

	public int buscarJogo(String nomeJogo) {
		int encontrou = -1;

		for (int i = 0; i < listJogos.size(); i++) {

			if (listJogos.get(i).getNomeJogo().equals(nomeJogo)) {
				if(listJogos.get(i).getQuantidade() > 0) {

					encontrou = i;
					break;
				}	
			}

		}
		return encontrou;
	}

	public String listaEncontrado(int position) {

		if (listJogos.get(position).getQuantidade() > 0) {

			return "Nome do jogo: " + listJogos.get(position).getNomeJogo() + " \n" + "Preço do Jogo: "
					+ listJogos.get(position).getPreco() + "\n" + "Quantidade em estoque: "
					+ listJogos.get(position).getQuantidade() + "\n";

		}

		return "Produto zerado em estoque!";

	}

	public int removeQtd(int indice, int quantidade) {
		int resultQtdRemove = 0;
		if (listJogos.get(indice).getQuantidade() >= quantidade) {

			resultQtdRemove = (listJogos.get(indice).getQuantidade() - quantidade);

			listJogos.get(indice).setQuantidade(resultQtdRemove);
		}
		return resultQtdRemove;

	}

	public double somaTotal(int indice, int quantidade) {
		double resultSomaJogos = 0;
		resultSomaJogos = listJogos.get(indice).getPreco() * quantidade;

		return resultSomaJogos;

	}

	public String totalPreco(double precoTotal) {

		return "Preco total: " + precoTotal;

	}

	public double confirmarPagamento(double pagamento, double precoTotal) {
		double resultado = 0;
		if (pagamento < precoTotal) {
			resultado = precoTotal - pagamento;
		} else if (pagamento > precoTotal) {
			resultado = pagamento - precoTotal;
		} else {
			resultado = 0;
		}

		return resultado;

	}

	public String seuTroco(double resultado) {

		return "\n\nObrigado pela compra!!\n Seu Troco é: " + resultado + "\n";
	}

}
