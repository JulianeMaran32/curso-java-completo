package maran.java.base.arrays;

/**
 * foreach = para cada elemento será feito um laço de repetição
 * @author juliane.maran
 *
 */
public class Foreach {

	public static void main(String[] args) {
		
		// percorrer o laço
		double[] notas = { 9.9, 8.7, 7.2, 9.4 };
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		// foreach ou for avançado
		for(double nota : notas) {
			System.out.print(nota + " ");
		}

	}

}
