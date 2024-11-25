package maran.java.base.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("- Rian", "- Suzi", "- Luna", "- Meg", "- Layla");
		
		System.out.println("\nfor comum");
		for(int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("\nUsando o foreach");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// sequência de dados
		System.out.println("\nUsando Stream");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // laço interno

	}

}