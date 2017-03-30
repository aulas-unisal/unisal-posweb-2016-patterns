package estruturais.facade;

import java.time.LocalDateTime;

public class Estoque {
	public void enviaProduto(String produto, String enderecoEntrega) {
		System.out.println("O produto " + produto + " será entregue em " + enderecoEntrega + " as " + LocalDateTime.now());
	}
}
