package maran.java.base.estruturadecontroles;

public class TesteArg {

	public static void main(String[] args) {
		
		if(args.length > 0) {	// testa presença de argumentos
			// converte 1º argumento em inteiro
			int j = Integer.parseInt(args[0]);
			while(j >= 0) {
				System.out.println(j);
				j--;
			}
		} else {
			System.out.println("Falta um argumento inteiro.");
		}

	}

}
