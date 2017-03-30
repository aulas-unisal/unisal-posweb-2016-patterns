package criacao.builders;

import java.time.LocalDateTime;
import java.time.Month;

public class TesteBoletoBuilder {

	public static void main(String[] args) {
		BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorBoleto geradorBoleto = new GeradorBoleto(boletoBuilder,
				new BoletoVO("JDBI - TI", "COLEGIO ADVENTISTA", 509.50,
						LocalDateTime.of(2017, Month.APRIL, 10, 00, 00, 00), 12345));
		
		Boleto boleto = geradorBoleto.geraBoleto();
		
		System.out.println(boleto);
	}

}
