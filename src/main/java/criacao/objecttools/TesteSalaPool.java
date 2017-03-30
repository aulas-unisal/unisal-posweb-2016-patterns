package criacao.objecttools;

public class TesteSalaPool {

	public static void main(String[] args) {
		Pool<Sala> salaPool = new SalaPool();
		for (int i = 0; i < 10; i++) {
			salaPool.release(new Sala("Sala {" + i + "}"));
		}

		Sala sala = salaPool.acquire();
		while (sala != null) {
			System.out.println(sala.toString());
			sala = salaPool.acquire();
		}

	}

}
