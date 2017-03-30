package criacao.multiton;

import java.awt.Color;

import criacao.singleton.GsonSingleton;

public class Tema {
	private String nome;
	private Color corFundo;
	private Color corFonte;

	public Tema(String nome, Color corFundo, Color corFonte) {
		super();
		this.nome = nome;
		this.corFundo = corFundo;
		this.corFonte = corFonte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Color getCorFundo() {
		return corFundo;
	}

	public void setCorFundo(Color corFundo) {
		this.corFundo = corFundo;
	}

	public Color getCorFonte() {
		return corFonte;
	}

	public void setCorFonte(Color corFonte) {
		this.corFonte = corFonte;
	}

	@Override
	public String toString() {
		return GsonSingleton.getInstance().toJson(this);
	}

}
