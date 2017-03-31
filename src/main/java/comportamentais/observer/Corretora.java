package comportamentais.observer;

public class Corretora implements AcaoObserver {
	private String nome;

	public Corretora(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public void notificaAlteracao(Acao acao) {
		System.out.println(" Corretora " + this.nome + " sendo notificada :");
		System.out.println("A ação " + acao.getAcao() + " teve o seu valor alterado para " + acao.getValor());
	}

}
