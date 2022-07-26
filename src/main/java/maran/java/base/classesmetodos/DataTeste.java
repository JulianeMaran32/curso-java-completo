package maran.java.base.classesmetodos;

public class DataTeste {

	public static void main(String[] args) {
		
		/*
		 * data e data1 são instâncias
		 */
		
		Data data = new Data(4, 7, 2022);
//		data.dia = 4;
//		data.mes = 7;
//		data.ano = 2022;
		
		Data data1 = new Data();
		data1.dia = 1;
		data1.mes = 1;
		data1.ano = 1970;
		
		System.out.println(data.dataFormatada());	// this aponta para o objeto criado na linha 11	
		System.out.println(data1.dataFormatada());	// this aponta para o objeto criado na linha 16

	}

}