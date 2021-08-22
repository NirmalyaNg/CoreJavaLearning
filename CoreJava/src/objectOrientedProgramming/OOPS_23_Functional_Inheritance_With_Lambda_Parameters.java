package objectOrientedProgramming;

@FunctionalInterface
interface FunctionalInterfaceEx3{
	void greet(String name,String message);
}

public class OOPS_23_Functional_Inheritance_With_Lambda_Parameters {
	public static void main(String[] args) {
		FunctionalInterfaceEx3 f = (name,message)->{
			System.out.println(message + " " + name);
		};
		
		f.greet("Motu", "I love you");
	}
}
