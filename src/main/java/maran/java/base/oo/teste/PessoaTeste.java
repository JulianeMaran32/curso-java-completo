package maran.java.base.oo.teste;

import maran.java.base.oo.encapsulamento.Pessoa;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Juli", "Maran", 34);
		p1.setIdade(34); // alterar = setter
		
		System.out.println(p1.getIdade()); // ler = getter
		System.out.println(p1); // toString
		System.out.println(p1.getNomeCompleto());

	}

}
