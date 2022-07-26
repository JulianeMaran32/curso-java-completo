package maran.java.base.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * 1. Número para string binária... 6 => "110"
 * 2. Inverter a string... "110" => "011"
 * 3. Converter de volta para inteiro => "011" => 3
 * 
 * @author juliane.maran
 *
 */
public class DesafioMap {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> inverter = 
				s -> new StringBuilder(s).reverse().toString();
				
		Function<String, Integer> binarioParaInt = 
				s -> Integer.parseInt(s, 2);
				
		nums.stream()
			.map(Integer::toBinaryString)	// converte um número inteiro para string binária
			.map(inverter)					// Inverter a string
			.map(binarioParaInt)			// converte de volta para inteiro
			.forEach(System.out::println);
		
		
	}

	/*
	 * 1	1		1		1
	 * 2	10		01		1
	 * 3	11		11		3
	 * 4	100		001		1	
	 * 5	101		101		5
	 * 6	110		011		3
	 * 7	111		111		7
	 * 8	1000	0001	1
	 * 9	1001	1001	9
	 */
	
}