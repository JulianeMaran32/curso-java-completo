package maran.java.base.fundamentos;

public class Escopo02 {
	
	public static void main(String[] args) {
		
		System.out.println("Escopo");
		
		int idade = 20;
		int qtdePessoas = 3;
		boolean acompanhado;
		
		if (qtdePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 18 || acompanhado) {

			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}
		
		
	}

}
