package criacao.methodfactory;

public class EmissorCreator {
	public Emissor create(TipoEnvio envio) {
		Emissor emissor = null;
		switch (envio) {
		case SMS:
			emissor = new EmissorSMS();
			break;
		case EMAIL:
			emissor = new EmissorEMAIL();
			break;	
		case JMS:
			emissor = new EmissorJMS();
			break;
		default:
			throw new IllegalArgumentException("Tipo de envio de mensagem não conhecido.");
		}
		return emissor;
	}
}
