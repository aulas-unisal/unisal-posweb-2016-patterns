package comportamentais.command;

import java.util.ArrayList;
import java.util.List;

public class ListaDeComandos implements Comando{
	private List<Comando> comandos = new ArrayList<Comando>();

	public void adiciona(Comando comando) {
		this.comandos.add(comando);
	}

	@Override
	public void executa() {
		for (Comando comando : this.comandos) {
			comando.executa();
		}
	}
}
