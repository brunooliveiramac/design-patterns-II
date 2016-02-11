package Command;

public class ConcluiPedido implements Comando {

	private Pedido pedido;

	public ConcluiPedido(Pedido pedido) {  //Encpsula Comando
		this.pedido = pedido;
	}
	
	@Override 
	public void executa() {
		pedido.finaliza();
	}

}
