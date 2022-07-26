package maran.java.base.estruturadecontroles;

public class Condicional01 {
	
	public static void main(String[] args) {
		
		System.out.println("+--------------+");
		System.out.println("| condicionais |");
		System.out.println("+--------------+");
		
		int idade = 18;
		int qtdePessoas = 3;
		
		if(idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
			System.out.println("Seja bem-vindo(a)!");
		} else {
			
			if(qtdePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar, pois está acompanhado.");
			} else {
				System.out.println("Você é menor de 18 anos e está desacompanhado, NÃO pode entrar.");
			}
			
		}
		
	}

}
