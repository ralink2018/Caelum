package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{
	
	//Sobreescrita do metodo sacar na classe Conta.
	@Override
	public void saca(double valor){
		this.saldo -= (valor + 0.10);
	}
	
	public String getTipo(){
		return "Conta Corrente";
	}
	
}
