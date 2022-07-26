package maran.java.base.oo.teste;

import maran.java.base.oo.composicao.Cliente;
import maran.java.base.oo.composicao.Compra;
import maran.java.base.oo.composicao.Produto;

public class Sistema {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();		
		compra1.addItem("Caneta", 9.67, 100);
		compra1.addItem(new Produto(1897.88, "Notebook"), 2);
		
		Compra compra2 = new Compra();		
		compra2.addItem("Caderno", 10.50, 3);
		compra2.addItem(new Produto(799.99, "Impressora"), 1);
		
		Cliente cliente = new Cliente("Suzi Maran");
		cliente.addCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println("Valor total da compra: R$" + cliente.valorTotal());

	}

}
