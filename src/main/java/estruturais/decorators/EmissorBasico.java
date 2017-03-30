package estruturais.decorators;

public class EmissorBasico implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Emissor Básico: " + mensagem);
	}

}
