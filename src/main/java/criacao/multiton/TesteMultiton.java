package criacao.multiton;

import java.util.ArrayList;
import java.util.List;

public class TesteMultiton {
	public static void main(String[] args) {
		List<Tema> temas = new ArrayList<>();
		temas.add(TemaMultiton.getInstance(TemaEnum.SKY));
		temas.add(TemaMultiton.getInstance(TemaEnum.FIRE));
		
		for (Tema tema : temas) {
			System.out.println(tema.toString());
		}
	}
}
