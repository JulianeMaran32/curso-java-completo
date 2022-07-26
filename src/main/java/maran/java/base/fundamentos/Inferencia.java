package maran.java.base.fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		System.out.println("+------------+");
		System.out.println("| inferência |");
		System.out.println("+------------+");
		
		double a = 4.5;	// declara e inicializa a variável
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d;				// variável declarada
		d = 123.65;				// variável inicializada
		System.out.println(d);	// utilizada
		
		// o var quando declarado deve, obrigatoriamente, ser inicializado junto 
		// exemplo a baixo, não compila
//		var e;				
//		e = 123.45;
//		System.out.println(e);

	}

}
