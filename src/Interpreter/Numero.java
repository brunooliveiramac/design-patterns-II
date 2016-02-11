package Interpreter;

public class Numero implements Expressao {
 
	private int i;

	public Numero(int i) {
		this.i = i;

	}

	@Override
	public int avalia() {
		return i;
	}

}
