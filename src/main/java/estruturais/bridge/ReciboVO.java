package estruturais.bridge;

import patterns.util.GsonSingleton;

public class ReciboVO {
	
	private String emissor;
	private String favorecido;
	private double valor;

	public ReciboVO(String emissor, String favorecido, double valor) {
		super();
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public String getFavorecido() {
		return favorecido;
	}

	public void setFavorecido(String favorecido) {
		this.favorecido = favorecido;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return GsonSingleton.getInstance().toJson(this);
	}
}
