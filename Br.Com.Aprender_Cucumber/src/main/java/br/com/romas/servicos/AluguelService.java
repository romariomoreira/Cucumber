package br.com.romas.servicos;

import br.com.romas.entidades.Filme;
import br.com.romas.entidades.NotaAluguel;

public class AluguelService {

	
	public NotaAluguel alugar(Filme filme) {
		
		NotaAluguel nota  = new  NotaAluguel (); 
		nota.setPreco(filme.getAluguel());
		return nota ; 
		
		
	}
}
