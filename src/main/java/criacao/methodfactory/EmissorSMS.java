package criacao.methodfactory;

public class EmissorSMS implements Emissor{

	@Override
	public void envia(String message) {
		System.out.println("Enviando SMS...");
		System.out.println(message);
	}

}
