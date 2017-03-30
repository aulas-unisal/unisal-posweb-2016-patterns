package criacao.abstractfactory_methodfactory;

public interface ComunicadorFactory {
	Emissor createEmissor ();
	Receptor createReceptor (); 
}
