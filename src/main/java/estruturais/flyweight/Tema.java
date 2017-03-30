package estruturais.flyweight;

import criacao.singleton.GsonSingleton;

public class Tema {
	private String titulo;
	private String texto;

	public Tema(String titulo, String texto) {
		super();
		this.titulo = titulo;
		this.texto = texto;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTexto() {
		return texto;
	}

	@Override
	public String toString() {
		return GsonSingleton.getInstance().toJson(this);
	}

}
