
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
		
		
		System.out.println("Saldo Atual: " + dat.recuperarDadosParaImpressao());
		System.out.println("Rendimento Mensal: " + dat.calcularRendimentos());
	}

}
