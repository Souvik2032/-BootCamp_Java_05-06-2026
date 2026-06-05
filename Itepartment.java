package abstractDemo;

public abstract class Itepartment implements Employee{
	public abstract void dept();
	public abstract void salary();
	public void SetUp() {
		System.out.println("SetUp is done");
	}
	public void support() {
		System.out.println("Support is done");
	}
}
