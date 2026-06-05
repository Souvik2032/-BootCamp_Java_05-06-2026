package exceptionDemo;

public class CheckedException_TryCatch {
	int x=10;
	
	public void m1() {
		System.out.println(x);
	}
	public static void main(String args[]) {
		CheckedException_TryCatch obj= new CheckedException_TryCatch();
		obj.m1();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
