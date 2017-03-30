package estruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Caminho implements Trecho{
	private List<Trecho> trechos;
	
	public Caminho() {	
		super();
		this.trechos = new ArrayList<>();
	}
	
	public void adiciona(Trecho trecho) {
		this.trechos.add(trecho);
	}
	
	public void remove(Trecho trecho) {
		this.trechos.remove(trecho);
	}

	@Override
	public void imprime() {
		for (Trecho trecho : trechos) {
			trecho.imprime();
		}
	}
	
}
