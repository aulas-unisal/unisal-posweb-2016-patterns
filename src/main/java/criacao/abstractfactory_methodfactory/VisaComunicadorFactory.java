package criacao.abstractfactory_methodfactory;

public class VisaComunicadorFactory implements ComunicadorFactory{
	private static final Bandeira VISA = Bandeira.VISA;
	
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	@Override
	public Emissor createEmissor() {
		return emissorCreator.create(VISA);
	}

	@Override
	public Receptor createReceptor() {
		return receptorCreator.create(VISA);
	}

}
