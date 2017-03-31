package comportamentais.state;

public class BandeiraAzul implements Bandeira{

	@Override
	public double calculaValorDaCorrida(double tempo, double distancia) {
		return 10.0 + tempo * 3.5 + distancia * 4.7;
	}

}
