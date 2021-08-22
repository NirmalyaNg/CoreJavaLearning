package objectOrientedProgramming;

interface MyInterface1{
	void display();
}

class MyClass implements MyInterface1{
	@Override
	public void display() {
		System.out.println("Display method of MyClass");
	}
}

public class OOPS_16_Interface_Example {
	public static void main(String[] args) {
		MyClass demo1 = new MyClass();
		demo1.display();
	}
}
