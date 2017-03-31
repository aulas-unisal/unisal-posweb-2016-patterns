package comportamentais.iterator;

import java.util.Iterator;

public class ListaDeNomes implements Iterable<String> {

	private String[] nomes;
	private int tamanho;

	public ListaDeNomes(String[] nomes) {
		super();
		this.nomes = nomes;
		this.tamanho = nomes.length;
	}

	@Override
	public Iterator<String> iterator() {
		return this.new ListaDeNomesIterator();
	}

	private class ListaDeNomesIterator implements Iterator<String> {

		private int i = 0;

		@Override
		public boolean hasNext() {
			return (this.i) < ListaDeNomes.this.tamanho;
		}

		@Override
		public String next() {
			return ListaDeNomes.this.nomes[i++];
		}

		public void remove() {
			ListaDeNomes.this.nomes[i] = null;
			for (int j = i; (j + 1) < ListaDeNomes.this.tamanho; j++) {
				ListaDeNomes.this.nomes[j] = ListaDeNomes.this.nomes[j + 1];
			}
			ListaDeNomes.this.tamanho--;
		}

	}

}
