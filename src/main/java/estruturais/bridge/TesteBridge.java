package estruturais.bridge;

import java.util.ArrayList;
import java.util.List;

public class TesteBridge {
	public static void main(String[] args) {
		List<GeradorDeArquivo> geradorDeArquivos = new ArrayList<>();
		geradorDeArquivos.add(new GeradorDeArquivoHTML());
		geradorDeArquivos.add(new GeradorDeArquivoTXT());
		
		for (int i = 0; i < geradorDeArquivos.size(); i++) {
			new Recibo("NF-["+i+"]", new ReciboVO("JDBI{" + i + "} - Tecnologia da Informação",
					"TEC Engenharia Ltda.", (1527.55 * (i + 10)) ), geradorDeArquivos.get(i)).gerarArquivo();
		}	
		
	}
}	
