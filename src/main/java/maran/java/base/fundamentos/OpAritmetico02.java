package maran.java.base.fundamentos;

public class OpAritmetico02 {
	
	public static void main(String[] args) {
		
		System.out.println("+------------------------+");
		System.out.println("| Operadores Aritméticos |");
		System.out.println("+------------------------+");
		
		double numeradorA = Math.pow(6 * (3 + 2), 2);
		double denominadorA = 3 * 2;
		
		double numeradorB = (1 - 5) * (2 - 7);
		double denominadorB = 2;
		
		double superiorA = numeradorA / denominadorA;
		double superiorB = Math.pow(numeradorB / denominadorB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("Resultado: " + resultado);
		
	}
	
}