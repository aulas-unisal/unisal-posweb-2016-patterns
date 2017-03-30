package criacao.abstractfactory;

public interface ComunicadorFactory {
	Emissor createEmissor ();
	Receptor createReceptor (); 
}
