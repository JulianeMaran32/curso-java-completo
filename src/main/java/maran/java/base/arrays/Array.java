package maran.java.base.arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		double[] notaAlunoA = new double[4];
		System.out.println(Arrays.toString(notaAlunoA));
		
		notaAlunoA[0] = 7.9;
		notaAlunoA[1] = 8;
		notaAlunoA[2] = 6.7;
		notaAlunoA[3] = 9.7;
				
		System.out.println(Arrays.toString(notaAlunoA));
		System.out.println(notaAlunoA[0]);
		System.out.println(notaAlunoA[notaAlunoA.length - 1]);
//		System.out.println(notaAlunoA[4]);	// erro
		
		double totalAlunoA = 0;
		for(int i = 0; i < 3; i++) {
			totalAlunoA += notaAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notaAlunoA.length);
		final double notaArmazenada = 5.9;
		double[] notaAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		double totalAlunoB = 0;
		for(int i = 0; i < notaAlunoB.length; i++) {
			totalAlunoB += notaAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notaAlunoB.length);

	}

}
