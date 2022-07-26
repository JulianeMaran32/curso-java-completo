package maran.java.base.oo.teste;

import maran.java.base.oo.composicao.Compra;

/**
 * Um item está dentro de uma compra
 * Uma compra tem vários itens
 * 1 para n
 * @author juliane.maran
 *
 */
public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "João Pedro";
		c1.addItem("Caneta", 20, (int) 7.45);
		c1.addItem("Borracha", 5, (int) 3.89);
		c1.addItem("Caderno", 2, (int) 18.79);
		
		System.out.println("size: " + c1.itens.size()); 
//		System.out.println("Valor total: " + c1.getValorTotal());
		System.out.println("Valor total: " + c1.valorTotal());
		
		// relação bidirecional
		double total = c1.valorTotal();
//		double total = c1.itens.get(0)
//				.compra.itens.get(1)
//				.compra.getValorTotal();
		System.out.println("Total é R$" + total);

	}

}