package comportamentais.templatemethod;

public class TestaContas {

	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.deposita(100);
		contaCorrente.saca(10);
		System.out.println(contaCorrente.toString());
		
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.deposita(100);
		contaPoupanca.saca(10);
		System.out.println(contaPoupanca.toString());
	}

}
