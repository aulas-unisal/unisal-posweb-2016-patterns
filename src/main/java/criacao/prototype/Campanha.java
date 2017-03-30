package criacao.prototype;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import criacao.singleton.GsonSingleton;

public class Campanha implements Prototype<Campanha> {
	private String nome;
	private LocalDateTime vencimento;
	private Set<String> palavrasChave;

	public Campanha(String nome, LocalDateTime vencimento, Set<String> palavrasChave) {
		super();
		this.nome = nome;
		this.vencimento = vencimento;
		this.palavrasChave = palavrasChave;
	}

	public Campanha clone() {
		LocalDateTime localDateTimeCopia = this.vencimento;
		return new Campanha("[Cópia] - " + this.nome, localDateTimeCopia, new HashSet<String>(this.palavrasChave));
	}

	public String getNome() {
		return nome;
	}

	public LocalDateTime getVencimento() {
		return vencimento;
	}

	public Set<String> getPalavrasChave() {
		return palavrasChave;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setVencimento(LocalDateTime vencimento) {
		this.vencimento = vencimento;
	}

	public void setPalavrasChave(Set<String> palavrasChave) {
		this.palavrasChave = palavrasChave;
	}

	@Override
	public String toString() {
		return GsonSingleton.getInstance().toJson(this);
	}

}
