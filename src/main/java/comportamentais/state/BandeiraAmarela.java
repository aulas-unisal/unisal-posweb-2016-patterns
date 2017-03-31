package comportamentais.state;

public class BandeiraAmarela implements Bandeira{

	@Override
	public double calculaValorDaCorrida(double tempo, double distancia) {
		return 5.0 + tempo * 1.5 + distancia * 1.7;
	}

}
