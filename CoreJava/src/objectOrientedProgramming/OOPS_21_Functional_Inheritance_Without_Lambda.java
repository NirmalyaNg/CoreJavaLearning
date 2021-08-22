package objectOrientedProgramming;

@FunctionalInterface
interface FunctionalInterfaceEx{
	int a = 10;
	void greet();
	
	static void calculateSum(int a,int b) {
		System.out.println("Sum is : " + (a+b));
	}
	
	default void myDefaultMethod() {
		System.out.println("I am a default method");
	}
}

class MyDemoClass implements FunctionalInterfaceEx{
	
	@Override
	public void greet() {
		System.out.println("Hello from MyDemoClass");
	}
}

public class OOPS_21_Functional_Inheritance_Without_Lambda {
	public static void main(String[] args) {
		MyDemoClass m = new MyDemoClass();
		m.greet();
	}
}
