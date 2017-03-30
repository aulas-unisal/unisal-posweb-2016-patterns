package estruturais.facade;

import java.time.LocalDateTime;

public class PosVenda {
	public void agendaContato(String cliente, String produto) {
		System . out. println (" Entrar em contato com " + cliente  + " sobre o produto " + produto + " no dia " + LocalDateTime.now().plusDays(10));
	}
}
