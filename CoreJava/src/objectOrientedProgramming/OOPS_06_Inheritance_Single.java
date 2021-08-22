package objectOrientedProgramming;
class Father{
	protected int fProperty = 1500000;
	
	void display1() {
		System.out.println("Father Property is : Rs " + this.fProperty);
	}
}

class Child extends Father{
	protected int childProperty = 15000;
	
	void display2() {
		this.display1();
		System.out.println("Child Property is : Rs " + this.childProperty);
	}
}

public class OOPS_06_Inheritance_Single {
	public static void main(String[] args) {
		Child child1 = new Child();	
		child1.display2();
	}
}
