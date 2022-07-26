package maran.java.base.exercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		System.out.println("+-------------+");
		System.out.println("| Calculadora |");
		System.out.println("+-------------+");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Número: ");
		double numA = entrada.nextDouble();
		
		System.out.println("Número: ");
		double numB = entrada.nextDouble();
		
		System.out.println("Operador: ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? numA + numB : 0;
		resultado = "-".equals(op) ? numA - numB : resultado;
		resultado = "*".equals(op) ? numA * numB : resultado;
		resultado = "/".equals(op) ? numA / numB : resultado;
		resultado = "%".equals(op) ? numA % numB : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", numA, op, numB, resultado);
		
		entrada.close();
		
	}
	
}