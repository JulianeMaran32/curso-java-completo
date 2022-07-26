package maran.java.base.oo.teste;

import maran.java.base.oo.abstrato.Animal;
import maran.java.base.oo.abstrato.Cachorro;
import maran.java.base.oo.abstrato.Mamifero;

public class AbstratoTeste {

	public static void main(String[] args) {
		
		Animal animal = new Cachorro();
		System.out.println(animal.mover());
		
		Mamifero mamifero = new Cachorro();
		System.out.println(mamifero.mamar());
		
		Animal animal2 = new Cachorro();
		System.out.println(animal2.respirar());

	}

}
