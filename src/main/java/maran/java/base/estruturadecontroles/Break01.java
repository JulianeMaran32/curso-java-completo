package maran.java.base.estruturadecontroles;

public class Break01 {

	public static void main(String[] args) {
		
		System.out.println("+-------+");
		System.out.println("| break |");
		System.out.println("+-------+");
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}

}
