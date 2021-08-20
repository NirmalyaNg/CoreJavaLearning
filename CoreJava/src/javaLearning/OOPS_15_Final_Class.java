package javaLearning;

final class AClass{
	int a;
	int b;
}

/*
class B extends A{   --> Cant be inherited
	
}
*/


public class OOPS_15_Final_Class {
	public static void main(String[] args) {
		AClass a1 = new AClass();
		a1.a = 10;
		a1.b = 20;
		
		System.out.println(a1.a);
		System.out.println(a1.b);
	}
}
