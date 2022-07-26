package maran.java.base.estruturadecontroles;

/**
 * tabuada do 2
 * @author juliane.maran
 *
 */
public class While02 {

	public static void main(String[] args) {
		
		System.out.println("+-------+");
		System.out.println("| while |");
		System.out.println("+-------+");
		System.out.println();
		
		int contador = 0;
		while(contador <= 20) {
			System.out.printf("i = %d\n", contador);
			contador += 2;
		}

	}

}
