package criacao.abstractfactory_methodfactory;

public class EmissorCreator {
	public Emissor create(Bandeira bandeira) {
		Emissor emissor = null;
		switch (bandeira) {
		case VISA:
			emissor = new EmissorVisa();
			break;
		case MASTERCARD:
			emissor = new EmissorMastercard();
			break;
		default:
			throw new IllegalArgumentException("Bandeira inválida.");
		}
		return emissor;
	}
}
