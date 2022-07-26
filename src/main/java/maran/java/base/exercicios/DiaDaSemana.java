package maran.java.base.exercicios;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		
		System.out.println("+---------------+");
		System.out.println("| Dia da semana |");
		System.out.println("+---------------+");
		System.out.println("| Domingo = 1   |");
		System.out.println("| Segunda = 2   |");
		System.out.println("| Terça   = 3   |");
		System.out.println("| Quarta  = 4   |");
		System.out.println("| Quinta  = 5   |");
		System.out.println("| Sexta   = 6   |");
		System.out.println("| Sábado  = 7   |");
		System.out.println("+---------------+");
		
		System.out.println();
		
		Scanner entrada = new Scanner(System.in);		
		System.out.print("Dia da semana: ");
		
		String dia = entrada.next();
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		} else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		} else if("terca".equalsIgnoreCase(dia) 
				|| "terça".equalsIgnoreCase(dia)) {
			System.out.println(3);
		} else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		} else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		} else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		} else if("sabado".equalsIgnoreCase(dia) 
				|| "sábado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		} else {
			System.out.println("Dia inválido!");
		}
		

	}

}
