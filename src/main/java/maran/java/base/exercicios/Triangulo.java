package maran.java.base.exercicios;

import java.util.Scanner;

/**
 * Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
 * @author juliane.maran
 *
 */
public class Triangulo {

	public static void main(String[] args) {

		System.out.println("+-----------+");
		System.out.println("| Triângulo |");
		System.out.println("+-----------+");
		System.out.println();	

		Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite a Base:");
		double base = scanner.nextDouble();
		
		System.out.println("Digite a Altura:");
		double altura = scanner.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A Área do Triângulo é: " + area);
		
		scanner.close();
		
	}

}
