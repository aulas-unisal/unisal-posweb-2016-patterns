package estruturais.flyweight;

public class Slide {
	private TemaFlyweight temaFlyweight;
	private Tema tema;

	public Slide(TemaFlyweight temaFlyweight, Tema tema) {
		this.tema = tema;
		this.temaFlyweight = temaFlyweight;
	}

	public void imprime() {
		this.temaFlyweight.imprime(tema);
	}
}