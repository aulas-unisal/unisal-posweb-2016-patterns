package criacao.multiton;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class TemaMultiton {
	private static Map<TemaEnum, Tema> temas = new HashMap<>();
	public static final String SKY = TemaEnum.SKY.toString();
	public static final String FIRE = TemaEnum.FIRE.toString();
	
	static{
		temas.put(TemaEnum.SKY, new Tema(TemaEnum.SKY.toString(), Color.BLUE, Color.BLACK));
		temas.put(TemaEnum.FIRE, new Tema(TemaEnum.FIRE.toString(), Color.RED, Color.WHITE));
	}
	
	private TemaMultiton(){
		
	}
	
	public static Tema getInstance(TemaEnum tema){
		return TemaMultiton.temas.get(tema);
	}
}
