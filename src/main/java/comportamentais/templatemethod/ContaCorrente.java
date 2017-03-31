package comportamentais.templatemethod;

import criacao.singleton.GsonSingleton;

public class ContaCorrente extends Conta{

	public ContaCorrente() {
		super();
		System.out.println("ContaCorrente");
	}

	@Override
	public double calculaTaxa() {
		return 3;
	}

	@Override
	public String toString() {
		return GsonSingleton.getInstance().toJson(this);
	}
	
}
