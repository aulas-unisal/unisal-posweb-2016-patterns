package comportamentais.mediator;

public class Taxi {
	private int id;
	private static int contador = 0;
	private CentralTaxi centralTaxi;

	public Taxi(CentralTaxi centralTaxi) {
		super();
		this.centralTaxi = centralTaxi;
		this.id = Taxi.contador++;
	}

	public void atende() {
		try {
			Thread.sleep((long) (Math.random() * 3000.0));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.centralTaxi.adicionaTaxiDisponivel(this);
	}

	public CentralTaxi getCentralTaxi() {
		return centralTaxi;
	}

	public void setCentralTaxi(CentralTaxi centralTaxi) {
		this.centralTaxi = centralTaxi;
	}

	public int getId() {
		return id;
	}

}
