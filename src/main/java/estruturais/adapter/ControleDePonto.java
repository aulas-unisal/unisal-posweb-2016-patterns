package estruturais.adapter;

import java.time.LocalDateTime;

public class ControleDePonto {
	public void registraEntrada(Funcionario f) {
		System.out.println(" Entrada : " + f.getNome() + " às " + LocalDateTime.now());
	}

	public void registraSaida(Funcionario f) {
		System.out.println(" Saída : " + f.getNome() + " às " + LocalDateTime.now());
	}
}
