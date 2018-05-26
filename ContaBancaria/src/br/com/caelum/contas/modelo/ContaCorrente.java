package br.com.caelum.contas.modelo;

// Classe Conta Corrente extende Conta e implementa a Interface Tributavel.
public class ContaCorrente extends Conta implements Tributavel{
	
	//Sobreescrita do metodo sacar na classe Conta.
	@Override
	public void saca(double valor){
		if(valor < 0){
			throw new IllegalArgumentException("Voce tentou scar um valor negativo!");
		}
		if(this.saldo < valor){
			throw new SaldoInsuficienteException();
		}
		this.saldo -= (valor + 0.10);
	}
	
	public String getTipo(){
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
	
}
