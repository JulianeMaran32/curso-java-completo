package maran.java.base.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		// lista do tipo string
//		Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();	// ordenação
		
		listaAprovados.add("Rian");
		listaAprovados.add("Suzi");
		listaAprovados.add("Luna");
		listaAprovados.add("Gabi");
				
		for(String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(22);
		nums.add(333);
		nums.add(4444);
		
		for(int n : nums) {
			System.out.println(n);
		}
		
	}

}