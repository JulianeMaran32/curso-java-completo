package maran.java.base.fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		System.out.println("+---------------------+");
		System.out.println("| Primitivo vs Objeto |");
		System.out.println("+---------------------+\n");
		
		String s = new String("texto");
		s.toUpperCase();
		
		// Wrappers são a versão objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);

	}

}
