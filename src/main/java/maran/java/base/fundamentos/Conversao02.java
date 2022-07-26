package maran.java.base.fundamentos;

import java.util.Scanner;

public class Conversao02 {
	
	public static void main(String[] args) {
		
		System.out.println("+-----------+");
		System.out.println("| conversão |");
		System.out.println("+-----------+");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Salário 01: ");
		String valor1 = entrada.next().replace(",", ".");	// converte vírgula para ponto
		
		System.out.print("Salário 02: ");
		String valor2 = entrada.next().replace(",", ".");	// converte vírgula para ponto
		
		System.out.print("Salário 03: ");
		String valor3 = entrada.next().replace(",", ".");	// converte vírgula para ponto
		
		// converte string para double
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double somaSalario = salario1 + salario2 + salario3;
		double media = somaSalario / 3;
		
		System.out.println("Média dos salários: " + media);
		
		entrada.close();
		
	}

}
