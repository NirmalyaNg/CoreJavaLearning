package javaLearning;

class DemoClass{
	// Definition of method1
	void display(int n) {
		System.out.println("Display : " + n);
	}
	
	// Definition of method2
	void display(int a,int b) {
		System.out.println("Display : " + a + " " + b);
	}
	
	// Definition of method3
	void display(String name) {
		System.out.println("Display : " + name);
	}
}


public class OOPS_10_Static_Binding {
	public static void main(String[] args) {
		DemoClass demo1 = new DemoClass();
		demo1.display(10); // Invoking method display1
		demo1.display(10,20); // Invoking method display2
		demo1.display("Motu"); // Invoking method display3
	}
}
