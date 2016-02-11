package Visitor;

public class Programa {
	
	
	  public static void main(String[] args) {

      Expressao esquerda = new Soma(new Numero(10), new Numero(5));
      Expressao direita = new Subtracao(new Numero(50), new Numero(10));
      Expressao soma = new Soma(esquerda, direita);
      
      int resultado = soma.avalia();
      
      System.out.println(resultado);
      
      Impressora impressora = new Impressora();
      
      soma.aceita(impressora);
     
	  }
	

}
