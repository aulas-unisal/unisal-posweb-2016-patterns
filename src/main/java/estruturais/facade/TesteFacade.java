package estruturais.facade;

public class TesteFacade {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		Financeiro financeiro = new Financeiro();
		PosVenda posVenda = new PosVenda();
		PedidoFacade pedidoFacade = new PedidoFacade(estoque, financeiro, posVenda);
		
		Pedido pedido = new Pedido("Notebook Acer i7", "JDBI - TI", "Lorena - Vila Nunes - 10");
		
		pedidoFacade.registraPedido(pedido);
	}

}
