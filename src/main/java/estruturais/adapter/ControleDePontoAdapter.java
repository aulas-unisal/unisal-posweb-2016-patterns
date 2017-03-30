package estruturais.adapter;

public class ControleDePontoAdapter extends ControleDePonto{
	private ControleDePontoNovo controleDePontoNovo;

	public ControleDePontoAdapter() {
		super();
		this.controleDePontoNovo = new ControleDePontoNovo();
	}
	
	@Override
	public void registraEntrada(Funcionario funcionario) {
		this.controleDePontoNovo.registra(funcionario, true);
	}
	
	@Override
	public void registraSaida(Funcionario funcionario) {
		this.controleDePontoNovo.registra(funcionario, false);
	}
}
