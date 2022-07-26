package maran.java.base.exercicios;

import java.util.Scanner;

/**
 * Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
 * @author juliane.maran
 *
 */
public class Temperatura02 {
	
	public static void main(String[] args) {
		
		System.out.println("+-------------+");
		System.out.println("| Temperatura |");
		System.out.println("+-------------+");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		
		double conversao = ( celsius - 32 ) / 1.8;
		
		System.out.print("Valor em Farenheit: " + conversao);
		
		scanner.close();
		
	}

}
