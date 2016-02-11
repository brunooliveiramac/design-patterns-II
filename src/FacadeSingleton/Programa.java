package FacadeSingleton;

public class Programa {
	
	public static void main(String[] args) {
		
		
		EmpresaFacade fachada = new EmpresaFacadeSingleton().getInstancia();
		fachada.buscaCliente(cpf);
		
	}

}
