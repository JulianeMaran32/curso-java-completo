package maran.java.base.fundamentos;

public class OpAtribuicao {

	public static void main(String[] args) {
		
		System.out.println("+--------------------------+");
		System.out.println("| Operadores de Atribuição |");
		System.out.println("+--------------------------+");
		
		int a = 3;
		int b = a;
		int c = a + b;

		System.out.println("c += b " + (c += b));
		System.out.println("c -= b " + (c -= b));
		System.out.println("c *= b " + (c *= b));
		System.out.println("c /= b " + (c /= b));
		System.out.println("c %= b " + (c %= b));
	

	}

}
