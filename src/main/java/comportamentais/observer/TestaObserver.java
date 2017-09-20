package comportamentais.observer;

public class TestaObserver {

	public static void main(String[] args) {
		Acao acao = new Acao("VALE3", 45.63);

		Corretora corretora1 = new Corretora(" JDBI ");
		Corretora corretora2 = new Corretora(" UNISAL ");
		acao.registraInteressado(corretora1);
		acao.registraInteressado(corretora2);

		acao.setValor(50);
	}

}
