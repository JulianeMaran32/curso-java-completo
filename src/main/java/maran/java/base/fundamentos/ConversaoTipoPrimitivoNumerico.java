package maran.java.base.fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		System.out.println("+-----------------------------------+");
		System.out.println("| conversão tipo primitivo numérico |");
		System.out.println("+-----------------------------------+");
		
		double a = 1;	// implícito
		System.out.println(a);
		
		float b = (float) 1.12345; // explícito (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // explícito (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; // explícito (CAST)
		System.out.println(f);
		
	}

}
