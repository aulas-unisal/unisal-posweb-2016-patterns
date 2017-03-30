package estruturais.decorators;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class EmissorDecoratorComCompressao extends EmissorDecorator {

	public EmissorDecoratorComCompressao(Emissor emissor) {
		super(emissor);
	}

	@Override
	public void envia(String mensagem) {
		System.out.println("Comprimindo mensagem: " );
		String msg;
		try {
			msg = comprime(mensagem);
		} catch (Exception e) {
			msg = "Não foi possível comprimir a mensagem: " + mensagem;
		}
		this.getEmissor().envia(msg);
	}

	private String comprime(String mensagem) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DeflaterOutputStream dout = new DeflaterOutputStream(out, new Deflater());
		dout.write(mensagem.getBytes());
		dout.close();
		return new String(out.toByteArray());
	}
}
