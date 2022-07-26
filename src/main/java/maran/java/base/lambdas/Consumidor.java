package maran.java.base.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);		
		var p1 = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(p1);
		
		var p2 = new Produto("Notebook", 2987.99, 0.25);
		var p3 = new Produto("Caderno", 19.90, 0.03);
		var p4 = new Produto("Borracha", 7.80, 0.18);
		var p5 = new Produto("Lápis", 4.39, 0.19);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}