package maran.java.base.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		// implementa uma pilha
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno princípe");	// retorna true ou false
		livros.push("Don Quixote");			// lança exceção
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());		// retorna null - pilha vazia
		System.out.println(livros.element());	// lança exceção - pilha vazia
		System.out.println(livros.poll());		// retorna null - pilha vazia
		System.out.println(livros.remove());	// lança exceção - pilha vazia		
		System.out.println(livros.pop());		// remover da pilha - lança exceção quando a pilha estiver vazia
		
//				livros.size();
//				livros.clear();
//				livros.contains(livros);
//				livros.isEmpty();

	}

}
