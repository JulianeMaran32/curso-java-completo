package maran.java.base.exercicios;

import java.util.Scanner;

/**
 * Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC
 * @author juliane.maran
 *
 */
public class IMC01 {

	public static void main(String[] args) {

		System.out.println("+-----+");
		System.out.println("| IMC |");
		System.out.println("+-----+");
		System.out.println();		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o peso:");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite a altura:");
		double altura = scanner.nextDouble();
		
		double imc = peso / ( altura * altura );
		
		System.out.print("IMC: " + imc);
		
		scanner.close();

	}

}
