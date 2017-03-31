package comportamentais.state;

import java.util.ArrayList;
import java.util.List;

public class TestaState {

	public static void main(String[] args) {
		List<Bandeira> bandeiras = new ArrayList<>();
		bandeiras.add(new BandeiraAmarela());
		bandeiras.add(new BandeiraAzul());
		
		Taximetro taximetro = new Taximetro();
		
		for (Bandeira bandeira : bandeiras) {
			taximetro.setBandeira(bandeira);
			taximetro.calculaValorDaCorrida(10, 45);
		}
	}

}
