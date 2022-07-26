package maran.java.base.fundamentos;

public class OpUnario {

	public static void main(String[] args) {
		
		System.out.println("+--------------------------+");
		System.out.println("| Operadores de Atribuição |");
		System.out.println("+--------------------------+");
		System.out.println();
		
		int a = 1;
		int b = 2;		
		
		a++; // a = a + 1
		a--; // a = a - 1
		++b; // b = b + 1
		--b; // b = b - 1
		System.out.println(a); // 1
		System.out.println(b); // 2
		
		System.out.println();
		
		System.out.println(++a == b--); // true
		System.out.println(a == b);		// false
		System.out.println(a); 			// 2
		System.out.println(b); 			// 1
		
		System.out.println();
		
		int x = 0;
		int y = 0;
		
		y = ++x; // y = x + x				
		System.out.println("PRÉ incremento: x incrementado ANTES de seu uso: " + "\n x = " + x + "\n y = " + y);
		
		y = x++;		
		System.out.println("PÓS incremento: x incrementado DEPOIS de seu uso: " + "\n x = " + x + "\n y = " + y);
		
		y = --x;
		System.out.println("PRÉ decremento: x decremento ANTES de seu uso: " + "\n x = " + x + "\n y = " + y);
		
		y = x--;
		System.out.println("PÓS decremento: x decremento DEPOIS de seu uso: " + "\n x = " + x + "\n y = " + y);


	}

}
