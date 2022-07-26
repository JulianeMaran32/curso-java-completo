package maran.java.base.classesmetodos;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;	// atribuição por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		// objeto
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1;	// atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
	}

}
