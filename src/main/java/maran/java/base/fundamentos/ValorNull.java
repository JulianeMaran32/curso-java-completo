package maran.java.base.fundamentos;

public class ValorNull {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
//		String s2;
//		System.out.println(s2.concat("???")); // erro de compilação - variável s2 não foi inicializada
		
		String s2 = null;
		System.out.println(s2.concat("???")); // erro run time = erro de execução
		
		/*
		 * Exception in thread "main" java.lang.NullPointerException: 
		 * Cannot invoke "String.concat(String)" because "s2" is null 
		 * at br.com.jvm.cursos.fundamentos.ValorNull.main(ValorNull.java:14)
		 */
		
	}
	
}