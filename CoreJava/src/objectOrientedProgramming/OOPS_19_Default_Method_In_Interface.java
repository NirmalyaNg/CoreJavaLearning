package objectOrientedProgramming;

interface DemoInterface{
	void method1();
	void method2();
	default void method3() {
		System.out.println("This is a default method");
	}
}


class Demo implements DemoInterface{
	
	@Override
	public void method1() {
		System.out.println("This is Method1 of Demo Class");
	}
	
	@Override
	public void method2() {
		System.out.println("This is Method2 of Demo Class");
		
	}
}

class Demo2 implements DemoInterface{
	
	@Override
	public void method1() {
		System.out.println("This is Method1 of Demo2 Class");
	}
	@Override
	public void method2() {
		System.out.println("This is Method2 of Demo2 Class");
	}
}

class Demo3 implements DemoInterface{
	@Override
	public void method1() {
		System.out.println("This is Method1 of Demo3 Class");
	}
	@Override
	public void method2() {
		System.out.println("This is Method2 of Demo3 Class");
	}
	
	@Override
	public void method3() {
		System.out.println("This is Method3 of Demo3 Class");
	}
}

public class OOPS_19_Default_Method_In_Interface {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		d1.method3();
		d2.method3();
		d3.method3();
	}
}
