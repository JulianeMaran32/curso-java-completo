package maran.java.base.fundamentos;

public class OpRelacional01 {

	public static void main(String[] args) {
		
		System.out.println("+------------------------+");
		System.out.println("| Operadores Relacionais |");
		System.out.println("+------------------------+");
		
		int a = 97;
		int b = 'a';
		
		System.out.println("Igual == : " + (a == b));		
		System.out.println("Maior que > : " + (3 > 4));
		System.out.println("Maior ou igual a >= : " + (3 >= 3));
		System.out.println("Menor que < : " + (3 < 7));
		System.out.println("Menor ou igual a <= : " + (30 <= 7));
		System.out.println("Diferente != : " + (30 != 7));
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
	}

}