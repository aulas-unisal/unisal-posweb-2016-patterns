package comportamentais.observer;

import java.util.HashSet;
import java.util.Set;

public class Acao {
	private String acao;
	private double valor;
	private Set<AcaoObserver> observers = new HashSet<>();

	public Acao(String acao, double valor) {
		super();
		this.acao = acao;
		this.valor = valor;
	}

	public void registraInteressado(AcaoObserver interessado) {
		this.observers.add(interessado);
	}

	public void cancelaInteresse(AcaoObserver interessado) {
		this.observers.remove(interessado);
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
		for (AcaoObserver observer : observers) {
			observer.notificaAlteracao(this);
		}
	}

}
