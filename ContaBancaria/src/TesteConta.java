
public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DadosConta dat = new DadosConta();
		Data data = new Data();
		
		dat.setNome("Rafael Oliveira");
		dat.setNumero(3562);
		dat.setAgencia("35628-9");
		dat.setSaldo(1500.80);
		data.setDia(15);
		data.setMes(05);
		data.setAno(2017);
		
		dat.setData(data);
		
		DadosConta dat2 = new DadosConta();
		Data data2 = new Data();
		
		dat2.setNome("Helena Oliveira");
		dat2.setNumero(6666);
		dat2.setAgencia("35678-9");
		dat2.setSaldo(1500.80);
		data2.setDia(18);
		data2.setMes(06);
		data2.setAno(2018);
		
		dat2.setData(data2);
		
		System.out.println("Informacao: " + dat.recuperarDadosParaImpressao());
		System.out.println("Rendimento Mensal: " + dat.calcularRendimentos());
		System.out.println("Identificador: " + dat2.recuperarDadosParaImpressao());
	}

}
