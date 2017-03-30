package criacao.abstractfactory_methodfactory;

public class ReceptorCreator {
	public Receptor create(Bandeira bandeira) {
		Receptor receptor = null;
		switch (bandeira) {
		case VISA:
			receptor = new ReceptorVisa();
			break;
		case MASTERCARD:
			receptor = new ReceptorMastercard();
			break;
		default:
			throw new IllegalArgumentException("Bandeira inválida.");
		}
		return receptor;
	}
}
