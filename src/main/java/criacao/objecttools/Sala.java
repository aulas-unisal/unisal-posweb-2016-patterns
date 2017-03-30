package criacao.objecttools;

import criacao.singleton.GsonSingleton;

public class Sala {
	private String nome;

	public Sala(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isNaoNulo() {
		return this != null ? true : false;
	}

	@Override
	public String toString() {
		return GsonSingleton.getInstance().toJson(this);
	}

}
