package maran.java.base.oo.teste;

import maran.java.base.oo.Carro;
import maran.java.base.oo.Civic;
import maran.java.base.oo.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		System.out.println("Civic");
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println( c1);
		
		System.out.println();
		
		Ferrari c2 = new Ferrari(400);
		c2.ligarTurbo();
		c2.ligarAr();
		
		System.out.println("Ferrari");
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		c2.frear();
		System.out.println(c2);

	}

}
