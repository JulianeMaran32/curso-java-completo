package maran.java.base.exercicios;

import java.util.Scanner;

/**
 * informa se o ano atual é um ano bissexto
 * @author juliane.maran
 *
 */
public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano: ");
//		int ano = scanner.nextInt();
//		int anoBissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);
//
//		if (anoBissexto == 0) {
//			System.out.println(ano + " é um ano bissexto");
//		} else {
//			System.out.println(ano + " não é um ano bissexto");
//		}
		scanner.close();

	}

}
