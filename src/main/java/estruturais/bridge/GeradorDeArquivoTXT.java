package estruturais.bridge;

public class GeradorDeArquivoTXT implements GeradorDeArquivo{
	
	@Override
	public void gera(String conteudo) {
		System.out.println(GeradorDeArquivoTXT.class + " - " + conteudo);
	}

}
