package br.edu.ctup.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.ctup.model.Livros;



public class ControllerLivro {
	
	List<Livros> listLivro= new ArrayList<Livros>();
	
	public void cadastrarCliente(Livros livros) {
		
		listLivro.add(livros);
		
	}
	
	public List<Livros> listAllLivros() {
		// TODO Auto-generated method stub
		return listLivro;
	}
	
	public int validaLivro(String nomeLivro) {
		
		int encontrou = -1;
		for(int i = 0; i < listLivro.size(); i++) {
			if(listLivro.get(i).getNomeLivro().equals(nomeLivro)) {
				
				
				encontrou = i;
				

			}
			
		}
		return encontrou;

	}
	
	public List<Livros> listAllLivro() {
		// TODO Auto-generated method stub
		return listLivro;
	}
	
}
