package maran.java.base.oo.teste;

import maran.java.base.oo.composicao.Carro2;

public class CarroTeste2 {
	
	public static void main(String[] args) {
		
		Carro2 c1 = new Carro2();		
		System.out.println("Está ligado: " + c1.estaLigado());
		
		c1.ligar();
		System.out.println("Está ligado: " + c1.estaLigado());
		
		System.out.println("Giros: " + c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println("Giros após acelerar: " + c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		// encapsulamento
//		c1.motor.fatorInjecao = -30;
		
		System.out.println("Giros após frear: " + c1.motor.giros());
		
		// relação bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
		
	}

}
