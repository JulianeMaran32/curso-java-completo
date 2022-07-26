package maran.java.base.estruturadecontroles;

public class For02 {

	public static void main(String[] args) {

		System.out.println("+-----+");
		System.out.println("| for |");
		System.out.println("+-----+");
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}

	}

}
