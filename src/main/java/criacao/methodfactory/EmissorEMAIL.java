package criacao.methodfactory;

public class EmissorEMAIL implements Emissor{

	@Override
	public void envia(String message) {
		System.out.println("Enviando EMAIL...");
		System.out.println(message);
	}

}
