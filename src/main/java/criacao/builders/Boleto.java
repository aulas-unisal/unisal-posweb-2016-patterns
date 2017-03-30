package criacao.builders;

import java.time.LocalDateTime;

public interface Boleto {
	String getSacado();
	String getCedente();
	double getValor();
	LocalDateTime getVencimento();
	long nossoNumero();
	String toString();
}
