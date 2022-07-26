package maran.java.base.exercicios;

import java.util.Scanner;

/**
 * Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
 * @author juliane.maran
 *
 */
public class ValorAoQuadradoAoCubo {

	public static void main(String[] args) {

		System.out.println("+-----------------------+");
		System.out.println("| Ao quadrado e ao cubo |");
		System.out.println("+-----------------------+");
		System.out.println();	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor:");
		double valor = scanner.nextDouble();
		
		/** Existe também a seguinte possibilidade
		 * double quadrado = valor * valor;
		 * double cubo = valor * valor * valor;
		 */
		
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		System.out.print("O valor ao quadrado é: " + quadrado + "\n O valor ao cubo é: " + cubo);
		
		scanner.close();

	}

}