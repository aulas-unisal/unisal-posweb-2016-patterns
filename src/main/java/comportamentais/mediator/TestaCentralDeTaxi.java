package comportamentais.mediator;

public class TestaCentralDeTaxi {
	public static void main(String[] args) {
		CentralTaxi central = new CentralTaxi();
		Passageiro p1 = new Passageiro(" Jether ", central);
		Passageiro p2 = new Passageiro(" Denise ", central);
		Passageiro p3 = new Passageiro(" Beatriz + Isabelly ", central);
		Taxi t1 = new Taxi(central);
		central.adicionaTaxiDisponivel(t1);

		Taxi t2 = new Taxi(central);
		central.adicionaTaxiDisponivel(t2);

		new Thread(p1).start();
		new Thread(p2).start();
		new Thread(p3).start();
	}
}