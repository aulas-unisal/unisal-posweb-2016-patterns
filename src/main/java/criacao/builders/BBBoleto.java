package criacao.builders;

import java.time.LocalDateTime;

import criacao.singleton.GsonSingleton;

public class BBBoleto implements Boleto {

	private String sacado;
	private String cedente;
	private double valor;
	private LocalDateTime vencimento;
	private long nossoNumero;

	public BBBoleto(String sacado, String cedente, double valor, LocalDateTime vencimento, long nossoNumero) {
		super();
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;
	}

	@Override
	public String getSacado() {
		return this.sacado;
	}

	@Override
	public String getCedente() {
		return this.cedente;
	}

	@Override
	public double getValor() {
		return this.valor;
	}

	@Override
	public LocalDateTime getVencimento() {
		return this.vencimento;
	}

	@Override
	public long nossoNumero() {
		return this.nossoNumero;
	}

	public String toString() {
		return GsonSingleton.getInstance().toJson(this);
	}
}
