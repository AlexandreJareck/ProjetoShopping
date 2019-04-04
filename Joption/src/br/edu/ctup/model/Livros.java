package br.edu.ctup.model;

public class Livros {
	
	private String nomeLivro;
	private String nomeAutor;
	
	private double precoLivro;
	
	
	
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
	
	public double getPrecoLivro() {
		return precoLivro;
	}
	public void setPrecoLivro(double precoLivro) {
		this.precoLivro = precoLivro;
	}
	
	

	
	
	public Livros() {
		
	}
	
	 public Livros(String nomeDoLivro, String nomeDoAutor, double precoDoLivro){
	 this.nomeLivro = nomeDoLivro;
	 this.nomeAutor = nomeDoAutor;
	
	 this.precoLivro = precoDoLivro;
	
	}

}
