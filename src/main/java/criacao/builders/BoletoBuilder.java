package criacao.builders;

import java.time.LocalDateTime;

public interface BoletoBuilder {
	void buildSacado(String sacado);

	void buildCedente(String cedente);

	void buildValor(double valor);

	void buildVencimento(LocalDateTime vencimento);

	void buildNossoNumero(long nossoNumero);

	Boleto getBoleto();
}
