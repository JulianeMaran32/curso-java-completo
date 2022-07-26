package maran.java.base.fundamentos;

public class Fatorial {
	
	public static void main(String[] args) {
		
		System.out.println("Fatorial");
		
		int fatorial = 1;
		for(int i = 1; i < 11; i++) {
			fatorial *= i;
			System.out.println("Fatorial de " + i + " = " + fatorial);
		}
		
	}

}
