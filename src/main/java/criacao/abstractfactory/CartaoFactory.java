package criacao.abstractfactory;

public class CartaoFactory {
	public ComunicadorFactory getComunicadorFactory(Bandeira bandeira) throws Exception {
		String classe = "criacao.abstractfactory." + bandeira.getBandeira() + "ComunicadorFactory";
		Class<?> clazz = Class.forName(classe);
		return (ComunicadorFactory) clazz.newInstance();
	}
}
