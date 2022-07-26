package maran.java.base.fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		System.out.println("+---------+");
		System.out.println("| Wrapper |");
		System.out.println("+---------+\n");
		
		Scanner entrada = new Scanner(System.in);
		
		// byte
		Byte b = 100;	// byte		
		Short s = 1000;	// short
		System.out.println("Byte: " + b.byteValue());
		System.out.println("Short: " + s.toString());

//		Integer i = Integer.parseInt(entrada.next()); // int para string
		Integer i = 10000;	// int
		Long l = 100000L;	// long
		System.out.println("Integer: " + i * 3);
		System.out.println("Long: " + l);
		
		Float f = 123.10F;	// float
		System.out.println("Float: " + f);
		
		Double d = 1234.56;	// double
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");	// boolean para string		
		System.out.println("Boolean.parseBoolean(): " + bo);
		System.out.println("Boolean.parseBoolean(): " + bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println("Character: " + c);
		
		entrada.close();

	}

}
