package estruturais.flyweight;

public class TestesTemas {
	public static void main(String[] args) {
		Apresentacao a = new Apresentacao();
		a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.ASTERISCO),
				new Tema("1. Design Patterns", "Desenvolvimento de aplicações aplicando padrões de criação, estrutura e comportamental.")));
		a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.ASTERISCO),
				new Tema("2. Integração de sistemas", "Arquitetura SOA com ESB e serviços do tipo SOAP e RestFULL.")));
		
		a.imprime();
	}
}
