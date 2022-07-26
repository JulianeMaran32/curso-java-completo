package maran.java.base.fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		System.out.println("+-------------------------+");
		System.out.println("| conversão número string |");
		System.out.println("+-------------------------+");
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num1).length());		
		System.out.println(("" + num2).length());

	}

}