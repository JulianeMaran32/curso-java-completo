package maran.java.base.fundamentos;

public class OpLogico02 {
		
	public static void main(String[] args) {
		
		System.out.println("+--------------------+");
		System.out.println("| Operadores Lógicos |");
		System.out.println("+--------------------+");
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println("and = " + (condicao1 && condicao2));
		System.out.println("or = " + (condicao1 || condicao2));
		System.out.println("xor = " + (condicao1 ^ condicao2));
		System.out.println("not = " + (!!condicao1));
		System.out.println("not = " + (!condicao2));
		
		System.out.println();
		
		System.out.println("+---------------+|");
		System.out.println("| Tabela Verdade |");
		System.out.println("+---------------+|");
		
		System.out.println();
		
		System.out.println(" E / AND"); // binário
		System.out.println(" V e V = " + (true && true));
		System.out.println(" V e F = " + (true && false));
//		System.out.println(" F e V = " + (false && true));
//		System.out.println(" F e F = " + (false && false));
		
		System.out.println();
		
		System.out.println(" OU / OR"); // binário
//		System.out.println(" V ou V = " + (true || true));
//		System.out.println(" V ou F = " + (true || false));
		System.out.println(" F ou V = " + (false || true));
		System.out.println(" F ou F = " + (false || false));
		
		System.out.println();
		
		System.out.println(" OU exclusivo / XOR"); // binário
		System.out.println(" V ^ V = " + (true ^ true));
		System.out.println(" V ^ F = " + (true ^ false));
		System.out.println(" F ^ V = " + (false ^ true));
		System.out.println(" F ^ F = " + (false ^ false));
		
		System.out.println();
		
		System.out.println(" Negação / NOT"); // unário
		System.out.println(" !V = " + (!true));
		System.out.println(" !F = " + (!false));	
		
		
	}
	

}
