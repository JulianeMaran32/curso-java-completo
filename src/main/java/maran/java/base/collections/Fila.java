package maran.java.base.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		/*
		 * add e offer -> adicionam elementos na fila
		 * diferença está no comportamento, quando:
		 * a fila estiver cheia
		 * add -> retorna false
		 * offer -> lança exceção
		 */
		fila.add("Ana");			
		fila.offer("Carolina");		
		fila.add("Gabriela");		
		fila.offer("Gustavo");		
		fila.add("Marina");		
		fila.offer("Rafael");		
		fila.add("Rian");			
		fila.offer("Suzi");			
		
		/*
		 * peek e element -> obtém o próximo elemento na fila (sem remover)
		 * diferença está no comportamento, quando:
		 * a fila estiver vazia
		 * peek -> retorna null
		 * elmeent -> lança exceção
		 */
		System.out.println("peek(): " + fila.peek());		
		System.out.println("element(): " + fila.element());	
		
		/*
		 * poll e remove -> obtém o próximo elemento da fila e remove
		 * diferença está no comportamento, quando:
		 * a fila está vazia
		 * poll -> retorna null
		 * remove -> lança exceção
		 */
		System.out.println(fila.poll());	
		System.out.println(fila.remove());
		
		
//		fila.size();	// tamanho da fila
//		fila.clear();	// limpar fila
//		fila.isEmpty(); // saber se a fila está ou não vazia
//		fila.contains(""); // se determinado elemento está ou não contido na fila

	}

}
