package comportamentais.command;

public class TestaComandos {

	public static void main(String[] args) {
		Player player = new Player();
		ListaDeComandos comandos = new ListaDeComandos();
		
		comandos.adiciona(new TocaMusicaComando(player, "bon-jovi-1.mp3"));
		comandos.adiciona(new AumentaVolumeComando(player, 5));
		
		comandos.adiciona(new TocaMusicaComando(player, "bon-jovi-2.mp3"));
		comandos.adiciona(new DiminuiVolumeComando(player, 2));
		
		comandos.adiciona(new TocaMusicaComando(player, "bon-jovi-3.mp3"));
		
		comandos.executa();
	}

}
