package Memento;

public class Estado {
	
	
	private Contrato contrato;

	public Estado(Contrato contrato) {
		super();
		this.contrato = contrato;
	}
	
	public Contrato getContrato() {
		return contrato;
	}

}
