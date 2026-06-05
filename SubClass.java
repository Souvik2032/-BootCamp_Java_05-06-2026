package inheritance_demo;


public class SubClass extends Super_Class {
	public void acc_holder_name() {
		System.out.println("Give the name of the account holder");
	}
	public void balance() {
		System.out.println("Display the balance");
	}
public static void main(String[] args) {
	SubClass obj= new SubClass();
	obj.account();
	obj.branch();
	obj.acc_holder_name();
	obj.balance();
	System.out.println("-------");
	Super_Class obj2= new Super_Class();
	obj2.account();
	obj2.branch();

}
}
