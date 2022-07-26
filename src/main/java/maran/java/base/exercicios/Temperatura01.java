package maran.java.base.exercicios;

public class Temperatura01 {
	
	public static void main(String[] args) {
		
		System.out.println("+-------------+");
		System.out.println("| Temperatura |");
		System.out.println("+-------------+");
		System.out.println();
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("Resultado: " + celsius + "°C");
		
	}

}
