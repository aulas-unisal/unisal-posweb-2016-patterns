package estruturais.decorators;

public class EmissorDecoratorComCriptografia extends EmissorDecorator {

	public EmissorDecoratorComCriptografia(Emissor emissor) {
		super(emissor);
	}

	@Override
	public void envia(String mensagem) {
		System.out.println("Criptografando mensagem: ");
		this.getEmissor().envia(criptografa(mensagem));
	}

	private String criptografa(String mensagem) {
		return new StringBuilder(mensagem).reverse().toString();
	}
}
