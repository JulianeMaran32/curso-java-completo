package maran.java.base.estruturadecontroles;

public class Condicional02 {
	
	public static void main(String[] args) {
		
		System.out.println("+--------------+");
		System.out.println("| condicionais |");
		System.out.println("+--------------+");
		
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 && acompanhado) {

			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}
		
	}

}
