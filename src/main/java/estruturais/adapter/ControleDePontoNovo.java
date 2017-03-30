package estruturais.adapter;

import java.time.LocalDateTime;

public class ControleDePontoNovo {
	public void registra(Funcionario funcionario, boolean entrada) {
		if (entrada) {
			System.out.println(" Entrada : " + funcionario.getNome() + " às " + LocalDateTime.now());
		} else {
			System.out.println(" Saída : " + funcionario.getNome() + " às " + LocalDateTime.now());
		}
	}
}
