package comportamentais.state;

public class Taximetro {
	private Bandeira bandeira;
	
	public Taximetro() {
		super();
	}

	public Taximetro(Bandeira bandeira) {
		super();
		this.bandeira = bandeira;
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

	public void calculaValorDaCorrida(double tempo, double distancia) {
		System.out.println(this.bandeira.calculaValorDaCorrida(tempo, distancia));
	}
}
