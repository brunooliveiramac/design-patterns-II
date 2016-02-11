package Command;

public class Programa {
	
	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido("Bruno", 100.00);
		Pedido pedido2 = new Pedido("Java", 100.00);
		
		FilaDeTrabalho filaDeTrabalho  = new FilaDeTrabalho();
		
		filaDeTrabalho.adiciona(new PagaPedido(pedido1));
		
		filaDeTrabalho.adiciona(new PagaPedido(pedido2));
		
		filaDeTrabalho.processa(); //CallBack
	}

}
