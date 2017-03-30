package criacao.builders;

import java.time.LocalDateTime;

public class BBBoletoBuilder implements BoletoBuilder {
	private String sacado;
	private String cedente;
	private double valor;
	private LocalDateTime vencimento;
	private long nossoNumero;

	public void buildSacado(String sacado) {
		this.sacado = sacado;
	}

	public void buildCedente(String cedente) {
		this.cedente = cedente;
	}

	public void buildValor(double valor) {
		this.valor = valor;
	}

	public void buildVencimento(LocalDateTime vencimento) {
		this.vencimento = vencimento;
	}

	public void buildNossoNumero(long nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	public Boleto getBoleto() {
		return new BBBoleto(sacado, cedente, valor, vencimento, nossoNumero);
	}
}
