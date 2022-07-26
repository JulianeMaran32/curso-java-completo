package maran.java.base.lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		// <tipo de informação recebida, o tipo que será enviado>
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
//		System.out.println(parOuImpar.apply(34));
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
//		Function<String, String> empolgado = valor -> "!!!";
//		Function<String, String> duvida = valor -> "???";
		
		String resultadoFinal1 = parOuImpar
				.andThen(oResultadoE)
//				.andThen(empolgado)
				.apply(34);		
		System.out.println(resultadoFinal1);
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
//				.andThen(duvida)
				.apply(33);		
		System.out.println(resultadoFinal2);
		
	}

}