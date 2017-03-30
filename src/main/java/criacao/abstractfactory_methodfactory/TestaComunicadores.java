package criacao.abstractfactory_methodfactory;

import java.util.ArrayList;
import java.util.List;

public class TestaComunicadores {

	public static void main(String[] args) {
		List<ComunicadorFactory> comunicadores = new ArrayList<>();
		comunicadores.add(new VisaComunicadorFactory());
		comunicadores.add(new MastercardComunicadorFactory());
		
		String transacao = "valor=1000.45; senha:123456;";
		for (ComunicadorFactory cf : comunicadores) {
			cf.createEmissor().envia(transacao);
			System.out.println(cf.createReceptor().recebe());
			System.out.println();
		}
	}

}
