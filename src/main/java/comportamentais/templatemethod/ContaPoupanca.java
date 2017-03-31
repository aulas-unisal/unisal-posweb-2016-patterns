package comportamentais.templatemethod;

import criacao.singleton.GsonSingleton;

public class ContaPoupanca extends Conta{

	public ContaPoupanca() {
		super();
		System.out.println("ContaPoupanca");
	}

	@Override
	public double calculaTaxa() {
		return 0.81;
	}

	@Override
	public String toString() {
		return GsonSingleton.getInstance().toJson(this);
	}
	
}
