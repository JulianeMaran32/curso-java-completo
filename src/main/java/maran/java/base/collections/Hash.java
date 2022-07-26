package maran.java.base.collections;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Diogo"));
		
		/*
		 * se comentar o hashcode na classe usuario o retorno abaixo será false
		 */
		boolean resultado = usuarios.contains(new Usuario("Diogo"));		
		System.out.println(resultado);
		
	}

}
