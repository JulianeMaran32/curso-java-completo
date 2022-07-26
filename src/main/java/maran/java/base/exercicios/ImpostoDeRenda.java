package maran.java.base.exercicios;

public class ImpostoDeRenda {
	
	public static void main(String[] args) {
		
		System.out.println("+----------------------+");
		System.out.println("|Imposto de Renda 2022 |");
		System.out.println("+----------------------+");
		
		double salario = 2610.49;
		
		if(salario >= 0.00 && salario <= 1903.98) {
			System.out.println("Alíquota: Isento");
			System.out.println("Parcela dedutível: 0");
		} else if(salario >= 1903.99 && salario <= 2826.65) {
			System.out.println("Alíquota = 7,5%");
			System.out.println("Parcela dedutível até 142,80");
		} else if(salario >= 2826.66 && salario <= 3751.05) {
			System.out.println("Alíquota = 15%");
			System.out.println("Parcela dedutível até 354,80");
		} else if(salario >= 3751.06 && salario <= 4664.68) {
			System.out.println("Alíquota = 22,5%");
			System.out.println("Parcela dedutível até 636,13");
		} else if(salario >= 4664.69 && salario <= 200000.00) {
			System.out.println("Alíquota = 27,5%");
			System.out.println("Parcela dedutível até 869,36");
		}
		
	}
	
}