package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Conta dat = new Conta();
		Data data = new Data();
		
		dat.setTitular("Rafael Oliveira");
		dat.setNumero(3562);
		dat.setAgencia("35628-9");
		data.setDia(15);
		data.setMes(05);
		data.setAno(2017);
		
		dat.setData(data);
		
		Conta dat2 = new Conta();
		Data data2 = new Data();
		
		dat2.setTitular("Helena Oliveira");
		dat2.setNumero(6666);
		dat2.setAgencia("35678-9");
		data2.setDia(18);
		data2.setMes(06);
		data2.setAno(2018);
		
		dat2.setData(data2);
		
		System.out.println("Informacao: " + dat.recuperarDadosParaImpressao());
		System.out.println("Rendimento Mensal: " + dat.calcularRendimentos());
		System.out.println("Identificador: " + dat2.recuperarDadosParaImpressao());
	}

}
