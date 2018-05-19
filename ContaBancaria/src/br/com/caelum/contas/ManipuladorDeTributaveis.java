package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeTributaveis {
	
	private double total;
	
	public void calcularImpostos(Evento evento){
		//Calcular o Total de Impostos.
		total = 0;
		int tamanho = evento.getTamanhoDaLista("listaTributaveis");
		for(int x = 0; x < tamanho; x++){
			Tributavel tri = evento.getTributavel("listaTributaveis", x);
			total += tri.getValorImposto();
		}
		
	}
	public double getTotal(){
		return total;
		
	}

}
