package exceptionDemo;

public class TryCatchFinally {
	public static void main(String args[]) {
		System.out.println("Program starts");
	try {
		int x=10/2;
		System.out.println("Division "+x);
	}
	catch(ArithmeticException e) {
		System.out.println("Something went wrong check it");
	}
	finally {
	System.out.println("Program End");
}
}
}
