package criacao.methodfactory;

public class EmissorJMS implements Emissor {

	@Override
	public void envia(String message) {
		System.out.println("Enviando JMS...");
		System.out.println(message);
	}

}
