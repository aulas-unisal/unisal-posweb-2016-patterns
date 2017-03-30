package estruturais.facade;

public class Financeiro {
	public void fatura(String cliente, String produto) {
		System.out.println("Fatura [ Cliente: " + cliente + " - Produto: " + produto + " ]");
	}
}
