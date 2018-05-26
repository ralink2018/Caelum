package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta[] contas = new Conta[10];
		
		for(int x = 0; x < contas.length; x++){
			Conta conta = new ContaCorrente();
			conta.depositar(x * 100.0);
			contas[x] = conta;
		}
		double soma = 0;
		for(Conta contaTemp : contas){
			soma = soma + contaTemp.getSaldo();
		}
		System.out.println("Soma das Contas: " + contas.length);
	}

}
