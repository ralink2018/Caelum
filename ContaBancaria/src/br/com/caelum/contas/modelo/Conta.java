package br.com.caelum.contas.modelo;

public class Conta {
	
	private String titular;
	private Integer numero;
	private String agencia;
	protected double saldo;
	private static int identificador;
	
	Data data = new Data();
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public Data getData(){
		return data;
	}
	public Data setData(Data data){
		return this.data = data;
	}
	
	public static int getIdentificador() {
		return identificador;
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	//Metodo Calcular Rendimentos
	public double calcularRendimentos(){
		return this.saldo * 0.1;
		
	}
	//Metodo Mostra Dados
	public String recuperarDadosParaImpressao(){
		String dados = "\nTitular: " + this.getTitular();
		dados += "\nNumero: " + this.getNumero();
		dados += "\nAgencia: " + this.getAgencia();
		dados += "\nSaldo: " + this.getSaldo();
		dados += "\nDia: " + this.data.getDia();
		dados += "\nMes:" + this.data.getMes();
		dados += "\nAno: " + this.data.getAno();
		dados += "\nIdentificador: " + Conta.identificador++;
		return dados;
	}
	
	//Construtores
	public Conta(String titular){
		this.titular = titular;
	}
	public Conta(){
		
	}
	public String getTipo(){
		return "Conta";
	}
	public void saca(double valor) {
		
		
	}
	
	public void transfere(double valor, Conta conta){
		this.saca(valor);
		this.depositar(valor);
	}

}
