package objectOrientedProgramming;
interface AddInterface{
	int a = 20;  // Compiler adds public static final for attributes and public abstract for methods
	static void add(int a,int b) {
		System.out.println("Sum is : " + (a+b));
	}
}
public class OOPS_20_Static_Method_And_Attribute_In_Interface {
	public static void main(String[] args) {
		AddInterface.add(10, 20);
		//AddInterface.a = 50;  --> Error
		System.out.println(AddInterface.a);
		
	}
}
