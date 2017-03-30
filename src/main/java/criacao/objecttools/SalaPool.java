package criacao.objecttools;

import java.util.ArrayList;
import java.util.List;

public class SalaPool implements Pool<Sala> {

	private List<Sala> salas;

	
	public SalaPool() {
		super();
		this.salas = new ArrayList<>();
	}

	@Override
	public Sala acquire() {
		if (this.salas.size() > 0) {
			return this.salas.remove(0);
		} else {
			return null;
		}
		
	}

	@Override
	public void release(Sala t) {
		this.salas.add(t);
	}

}
