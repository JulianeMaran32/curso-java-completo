package maran.java.base.oo.teste;

import maran.java.base.oo.polimorfismo.Arroz;
import maran.java.base.oo.polimorfismo.Feijao;
import maran.java.base.oo.polimorfismo.PessoaPoli;
import maran.java.base.oo.polimorfismo.Sorvete;

/**
 * POLIMORFISMO
 * @author juliane.maran
 *
 */
public class Jantar {

	public static void main(String[] args) {
		
		PessoaPoli convidado = new PessoaPoli(99.65);
		
		Arroz arroz = new Arroz(0.2);
		Feijao feijao = new Feijao(0.1);
		Sorvete sorvete = new Sorvete(0.05);
		
		System.out.println("Peso inicial: " + convidado.getPeso() + "kg");
		
		convidado.comer(arroz);
		convidado.comer(feijao);
		
		System.out.println("Peso após comer arroz e feijão: " + convidado.getPeso() + "kg");
		
		convidado.comer(sorvete);
		System.out.println("Peso após comer sobremesa: " + convidado.getPeso() + "kg");
		
	}

}