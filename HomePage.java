package abstractDemo;

public abstract class HomePage {
	public abstract void product();
	public abstract void price();
	public void paymentMethod() {
		System.out.println("Select the payment method");
	}
	public void filter() {
		System.out.println("Filter out the product");
}
}