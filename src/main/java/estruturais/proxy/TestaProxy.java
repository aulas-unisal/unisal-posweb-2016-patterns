package estruturais.proxy;

public class TestaProxy {

	public static void main(String[] args) {
		Conta contaPadrao = new ContaPadrao();
		Conta contaProxy = new ContaProxy(contaPadrao);
		
		contaProxy.deposita(100.15);
		contaProxy.saca(55.15);
		
		System.out.println("Saldo: " + contaProxy.getSaldo());
	}

}
