package maran.java.base.estruturadecontroles;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		System.out.println("+----------+");
		System.out.println("| do while |");
		System.out.println("+----------+");
		System.out.println();
		
		Scanner entrada = new Scanner(System.in);	
		
		String texto = "por favor";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas... ");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigada!");
		entrada.close();

	}

}
