package exceptionDemo;

public class ClassExceptionUsingThrows {
	int x=10;
	
	public void m1() {
		System.out.println(x);
	}
	public static void main(String args[]) throws Exception {
		ClassExceptionUsingThrows obj= new ClassExceptionUsingThrows();
		obj.m1();
		Thread.sleep(1000);
	}
}
