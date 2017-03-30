package estruturais.flyweight;

import java.util.Arrays;

public class TemaAsterisco implements TemaFlyweight {
	
	@Override
	public void imprime(Tema tema) {
		System.out.println(tema.toString());
		System.out.println();
		System.out.println("********** " + tema.getTitulo() + " ********** ");
		System.out.println(tema.getTexto());
		char[] rodape = new char[22 + tema.getTitulo().length()];
		Arrays.fill(rodape, '*');
		System.out.println(rodape);
	}
}
