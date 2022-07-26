package maran.java.base.classesmetodos;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Rian Maran";
		u1.email = "rian.maran@email.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Suzi Maran";
		u2.email = "suzi.maran@email.com";
		
		// compara usuário 1 com o 2 - as opções abaixo dará FALSE
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));		
		
	}

}