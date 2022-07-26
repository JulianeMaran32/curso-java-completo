package maran.java.base.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Map<K, V> 
 * k = key = chave
 * v = value = valor
 * @author juliane.maran
 *
 */
public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Rian");	// adiciona se não existe ou substitui caso exista
		usuarios.put(2, "Suzi");
		usuarios.put(3, "Luna");
		
		System.out.println("size         : " + usuarios.size());	
		System.out.println("isEmpty      : " + usuarios.isEmpty());
		System.out.println("keySet       : " + usuarios.keySet());
		System.out.println("values       : " + usuarios.values());
		System.out.println("entrySet     : " + usuarios.entrySet());
		System.out.println("containsKey  : " + usuarios.containsKey(3));
		System.out.println("containsValue: " + usuarios.containsValue("Rian"));
		System.out.println("get          : " + usuarios.get(3));
		System.out.println("remove       : " + usuarios.remove(2));
		
		System.out.println();		
		System.out.println("percorre apenas a chave");
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println();		
		System.out.println("percorre apenas o valor");
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println();		
		System.out.println("percorre chave e valor");		
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro.getKey() + " - " + registro.getValue());
		}

	}

}
