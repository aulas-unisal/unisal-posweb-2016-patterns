package estruturais.composite;

import criacao.singleton.GsonSingleton;

public class TrechoCarro implements Trecho {
	private String direcao;
	private double distancia;

	public TrechoCarro(String direcao, double distancia) {
		super();
		this.direcao = direcao;
		this.distancia = distancia;
	}

	@Override
	public void imprime() {
		System.out.println(GsonSingleton.getInstance().toJson(this));
	}

	public String getDirecao() {
		return direcao;
	}

	public double getDistancia() {
		return distancia;
	}
}
