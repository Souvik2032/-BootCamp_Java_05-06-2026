package exceptionDemo;

public class CheckedException2 {
	int x=10;
	
	public void m1() {
		System.out.println(x/0);
	}
	public static void main(String args[]) {
		CheckedException2 obj= new CheckedException2();
		obj.m1();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
