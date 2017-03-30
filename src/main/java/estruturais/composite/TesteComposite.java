package estruturais.composite;

public class TesteComposite {

	public static void main(String[] args) {
		Trecho trecho1 = new TrechoAndando("Vá até o cruzamento da Av. Rebouças com a Av. Brigadeiro Faria Lima ", 500);
		Trecho trecho2 = new TrechoCarro("Vá até o cruzamento da Av. Brigadeiro Faria Lima com a Av. Cidade Jardim ", 1500);
		Trecho trecho3 = new TrechoCarro(" Vire a direita na Marginal Pinheiros ", 500);
		
		Caminho caminho = new Caminho();
		caminho.adiciona(trecho1);
		caminho.adiciona(trecho2);
		caminho.adiciona(trecho3);
		
		System.out.println("1. --------------------------------------");
		caminho.imprime();
		
		caminho.remove(trecho2);
		
		System.out.println();
		System.out.println("2. --------------------------------------");
		caminho.imprime();
	}

}
