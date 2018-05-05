package br.com.caelum.contas.modelo;

public class DadosConta {
	
	private String nome;
	private Integer numero;
	private String agencia;
	private Double saldo;
	private static int identificador;
	
	Data data = new Data();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
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
	
	void sacar(double valor){
		this.saldo -= valor;
	}
	
	void depositar(double valor){
		this.saldo += valor;
	}
	
	//Metodo Calcular Rendimentos
	public double calcularRendimentos(){
		return this.saldo * 0.1;
		
	}
	//Metodo Mostra Dados
	public String recuperarDadosParaImpressao(){
		String dados = "\nTitular: " + this.getNome();
		dados += "\nNumero: " + this.getNumero();
		dados += "\nAgencia: " + this.getAgencia();
		dados += "\nSaldo: " + this.getSaldo();
		dados += "\nDia: " + this.data.getDia();
		dados += "\nMes:" + this.data.getMes();
		dados += "\nAno: " + this.data.getAno();
		dados += "\nIdentificador: " + DadosConta.identificador++;
		return dados;
	}
	
	//Construtores
	public DadosConta(String titular){
		this.nome = titular;
	}
	public DadosConta(){
		
	}

}
