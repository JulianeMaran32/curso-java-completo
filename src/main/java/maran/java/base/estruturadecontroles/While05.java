package maran.java.base.estruturadecontroles;

import java.util.Scanner;

public class While05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Valor inteiro inferior: ");
		int min = entrada.nextInt();
		
		System.out.print("Valor inteiro superior: ");
		int max = entrada.nextInt();
		
		do {
			System.out.println(min + " < " + max);
			min++;
			max--;
		} while(min < max);
		
		System.out.println(min + " == " + max + " Condição Final!");		

	}

}
