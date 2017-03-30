package estruturais.decorators;

import java.util.ArrayList;
import java.util.List;

public class TesteDecorator {

	public static void main(String[] args) {
		String mensagem = "Jether Rodrigues do Nascimento";
		List<Emissor> emissores = new ArrayList<>();
		emissores.add(new EmissorBasico());
		emissores.add(new EmissorDecoratorComCompressao(new EmissorBasico()));
		emissores.add(new EmissorDecoratorComCriptografia(new EmissorBasico()));
		
		emissores.add(new EmissorDecoratorComCriptografia(new EmissorDecoratorComCompressao(new EmissorBasico())));
		
		for (Emissor emissor : emissores) {
			emissor.envia(mensagem);
			System.out.println();
		}
	}

}
