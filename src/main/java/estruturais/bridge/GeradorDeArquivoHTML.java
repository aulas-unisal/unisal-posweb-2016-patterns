package estruturais.bridge;

public class GeradorDeArquivoHTML implements GeradorDeArquivo{

	@Override
	public void gera(String conteudo) {
		System.out.println(GeradorDeArquivoHTML.class + " - " + conteudo);
	}

}
