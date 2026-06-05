package abstractDemo;

public class FinalPage extends HomePage {
	public void product() {
		System.out.println("Select the require product");
	}
	public void price() {
		System.out.println("See the price of the product");
	}
	public static void main(String args[]) {
		FinalPage obj = new FinalPage();
		obj.product();
		obj.price();
		obj.paymentMethod();
		obj.filter();
		System.out.println("-----");
		HomePage obj1=new FinalPage();
		obj.product();
		obj.price();
	}
}



