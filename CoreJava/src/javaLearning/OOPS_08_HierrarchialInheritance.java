package javaLearning;
class A{
	protected int a = 10;
}

class B extends A{
	protected int b = 20;
}

class C extends A{
	protected int c = 30;
}
public class OOPS_08_HierrarchialInheritance {
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println(c1.a);
		System.out.println(c1.c);
	}
}
