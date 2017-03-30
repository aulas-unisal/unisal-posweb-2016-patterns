package criacao.abstractfactory;

public class MastercardComunicadorFactory implements ComunicadorFactory {
	private static final Bandeira MASTERCARD = Bandeira.MASTERCARD;

	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();

	@Override
	public Emissor createEmissor() {
		return emissorCreator.create(MASTERCARD);
	}

	@Override
	public Receptor createReceptor() {
		return receptorCreator.create(MASTERCARD);
	}

}
