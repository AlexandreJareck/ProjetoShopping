package br.edu.ctup.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.ctup.model.Jogador;

public class ControllerJogador {
	
	List<Jogador> listJogador = new ArrayList<Jogador>();

	
	public void cadastrarPlayer(Jogador player) {
		
		listJogador.add(player);
		
	}
	
	public List<Jogador> listarJogador(){
		
		return listJogador;
		
	}
	
	public int autenticarPlayer(String login, String senha) {
		int position = -1;
		
				for (int i = 0; i < listJogador.size(); i++) {
					
					if(listJogador.get(i).getLogin().equals(login)
							&& listJogador.get(i).getSenha().equals(senha)) {
						
						 position = i;
						break;
						
					}
					
				}
			return position;	
	}
	
	public void alterarJogador(int position, Jogador player) {
		
		listJogador.get(position).setNomeJogador(player.getNomeJogador());
		listJogador.get(position).setSenha(player.getSenha());
		
	}

	
}

