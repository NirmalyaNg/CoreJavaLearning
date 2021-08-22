package objectOrientedProgramming;

@FunctionalInterface
interface FuncitonalInterfaceEx2{
	void display();
	
	static void greet() {
		System.out.println("Good Evening");
	}
	default void sayHi() {
		System.out.println("Hii !!");
	}
}

public class OOPS_22_Functional_Inheritance_With_Lambda {
	public static void main(String[] args) {
		FuncitonalInterfaceEx2 f = ()->{
			System.out.println("I am display");
		};
		
		f.display();
		FuncitonalInterfaceEx2.greet();
		f.sayHi();
	}
}
