package exceptionDemo;

public class UncheckedExceptionUsing_TryCatch {
	public static void main(String args[]) {
		System.out.println("Program starts");
	try {
		int x=10/0;
		System.out.println("Division "+x);
	}
	catch(ArithmeticException e) {
		System.out.println("Something went wrong check it");
	}
	System.out.println("Program End");
}
}
