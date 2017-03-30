package estruturais.adapter;

public class TesteAdapter {
	public static void main(String[] args) throws InterruptedException {
		ControleDePonto controleDePonto = new ControleDePontoAdapter();
		Funcionario funcionario = new Funcionario("Jether Rois");
		
		controleDePonto.registraEntrada(funcionario);
		Thread.sleep(5000);
		controleDePonto.registraSaida(funcionario);
	}
}
