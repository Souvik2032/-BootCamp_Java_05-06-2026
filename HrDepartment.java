package abstractDemo;

public class HrDepartment extends Itepartment {
	public void dept() {
		System.out.println("Department is here");
	}
	public void salary() {
		System.out.println("Salary is here");
	}
	public static void main(String args[]) {
		HrDepartment obj = new HrDepartment();
		obj.dept();
		obj.salary();
		obj.SetUp();
		obj.support();
	}
}
