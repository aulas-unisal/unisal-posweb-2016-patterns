package criacao.builders;

import java.time.LocalDateTime;

public class BoletoVO {
	private String sacado;
	private String cedente;
	private double valor;
	private LocalDateTime vencimento;
	private long nossoNumero;

	public BoletoVO(String sacado, String cedente, double valor, LocalDateTime vencimento, long nossoNumero) {
		super();
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;
	}

	public String getSacado() {
		return sacado;
	}

	public String getCedente() {
		return cedente;
	}

	public double getValor() {
		return valor;
	}

	public LocalDateTime getVencimento() {
		return vencimento;
	}

	public long getNossoNumero() {
		return nossoNumero;
	}
	
}
