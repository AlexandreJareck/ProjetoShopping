package br.edu.ctup.model;

public class Jogo {
	
	private String nomeJogo;
	private int quantidade;
	private double preco;
	private double precoTotal;
	
	
	
    public Jogo(String nomeJogo, int quantidade, double preco)
    {
        this.nomeJogo = nomeJogo;
        this.preco  = preco;
        this.quantidade = quantidade;
        this.precoTotal  = preco * quantidade;
    }
	
	

	public Jogo() {
		
		// TODO Auto-generated constructor stub
	}
	
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setPrecoTotal(double preco) {
		this.preco = precoTotal;
	}
	
	
	public double getPrecoTotal() {
		return precoTotal;
	}
	
	

}
