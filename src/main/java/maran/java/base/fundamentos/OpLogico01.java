package maran.java.base.fundamentos;

public class OpLogico01 {
	
	public static void main(String[] args) {
		
		System.out.println("+--------------------+");
		System.out.println("| Operadores Lógicos |");
		System.out.println("+--------------------+");
		
		// trabalho na terça = V ou F
		// trabalho na quinta = V ou F
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSAudavel = !comprouSorvete; // operador unário
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSAudavel);
		
	}

}
