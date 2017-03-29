package estruturais.bridge;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Recibo implements Documento {
	private String nomeArquivo;
	private ReciboVO reciboVO;
	private GeradorDeArquivo geradorDeArquivo;
	
	public Recibo(String nomeArquivo, ReciboVO reciboVO, GeradorDeArquivo geradorDeArquivo) {
		super();
		this.reciboVO = reciboVO;
		this.geradorDeArquivo = geradorDeArquivo;
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	public void gerarArquivo() {
		try {
			@SuppressWarnings("resource")
			PrintStream stream = new PrintStream(nomeArquivo);
			stream.println(reciboVO.toString());
			geradorDeArquivo.gera(stream.toString());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
