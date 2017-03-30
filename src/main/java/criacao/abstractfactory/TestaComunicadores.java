package criacao.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class TestaComunicadores {

	public static void main(String[] args) {
		List<ComunicadorFactory> comunicadores = new ArrayList<>();
		for (Bandeira bandeira : Bandeira.values()) {
			try {
				comunicadores.add(new CartaoFactory().getComunicadorFactory(bandeira));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
				
		String transacao = "valor=1000.45; senha:123456;";
		for (ComunicadorFactory cf : comunicadores) {
			cf.createEmissor().envia(transacao);
			System.out.println(cf.createReceptor().recebe());
			System.out.println();
		}
	}

}
