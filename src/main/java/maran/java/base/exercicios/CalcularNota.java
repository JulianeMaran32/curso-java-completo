package maran.java.base.exercicios;

import java.util.Scanner;

public class CalcularNota {

	public static void main(String[] args) {

		System.out.println("+------+");
		System.out.println("| Nota |");
		System.out.println("+------+");
		System.out.println();
		
		Scanner entrada = new Scanner(System.in);	
		
		int qtdeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("-1 para sair");
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				qtdeNotas++;
			} else if (nota != -1) {
				System.out.println("Nota inválida!");
			}
			
		}
		
		double media = total / qtdeNotas;
		System.out.println("Média: " + media);
		
		entrada.close();

	}

}