package maran.java.base.collections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana"); // 0
		lista.add(u1);
		
		lista.add(new Usuario("Rian"));	// 1
		lista.add(new Usuario("Suzi"));	// 2
		lista.add(new Usuario("Luna"));	// 3
		lista.add(new Usuario("Gabi"));	// 4
		
		System.out.println(lista.get(3).nome); // acessa pelo indice
		
		System.out.println(">>> " + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Ana")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Gabi")));
		System.out.println("Tem? " + lista.contains(u1));
		
		for(Usuario u : lista) {
			System.out.println(u.nome);
		}

	}

}
