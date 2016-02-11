package Flyweight;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Programa {
	
	public static void main(String[] args) {
		
	NotasMusicais notas = new NotasMusicais();
		
	
	//Sempre devolve a mesma instancia
	
	List<Nota> musica = Arrays.asList(
			notas.pega("do"), 
			notas.pega("re"),
			notas.pega("mi"), 
			notas.pega("fa"),
			notas.pega("fa"),
			notas.pega("fa"));
	
	};
	

}
	
	
	

