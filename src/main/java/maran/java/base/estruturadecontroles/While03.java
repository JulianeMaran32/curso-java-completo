package maran.java.base.estruturadecontroles;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		
		System.out.println("+-------+");
		System.out.println("| while |");
		System.out.println("+-------+");
		System.out.println();
		
		Scanner entrada = new Scanner(System.in);	
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();

	}

}
