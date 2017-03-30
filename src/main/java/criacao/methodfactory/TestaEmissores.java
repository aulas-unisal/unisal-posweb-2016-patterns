package criacao.methodfactory;

import java.util.ArrayList;
import java.util.List;

public class TestaEmissores {

	public static void main(String[] args) {
		List<Emissor> emissores = new ArrayList<>();
		
		for (TipoEnvio envio : TipoEnvio.values()) {
			emissores.add(new EmissorCreator().create(envio));
		}
		
		for (Emissor emissor : emissores) {
			emissor.envia("JETHER");
		}
	}

}
