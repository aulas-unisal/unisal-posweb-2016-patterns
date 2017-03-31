package comportamentais.mediator;

public class Passageiro implements Runnable{
	private String nome;
	private CentralTaxi centralTaxi;

	public Passageiro(String nome, CentralTaxi centralTaxi) {
		super();
		this.centralTaxi = centralTaxi;
		this.nome = nome;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			this.centralTaxi.pedeTaxi(this);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CentralTaxi getCentralTaxi() {
		return centralTaxi;
	}

	public void setCentralTaxi(CentralTaxi centralTaxi) {
		this.centralTaxi = centralTaxi;
	}
	
}
