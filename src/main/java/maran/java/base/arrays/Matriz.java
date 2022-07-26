package maran.java.base.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantidade de alunos? ");		
		int qtdAlunos = entrada.nextInt();
		
		System.out.print("Quantidade de notas por aluno? ");		
		int qtdNotas = entrada.nextInt();
				
		double[][] notasTurma = new double[qtdAlunos][qtdNotas];
		
		// percorrer a matriz
		double total = 0;
		for(int i = 0; i < notasTurma.length; i++) {		// aluno	
			for(int j = 0; j < notasTurma[i].length; j++) { // nota
				System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
				notasTurma[i][j] = entrada.nextDouble();
				total += notasTurma[i][j];
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média da turma: " + media);
		
		for(double[] notasAluno : notasTurma) {
			System.out.println(Arrays.toString(notasAluno));
		}
		
		
		entrada.close();

	}

}
