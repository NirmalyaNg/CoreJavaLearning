package javaLearning;

class Adder{
	public void add(int num1,int num2) {
		System.out.println("The sum is : " + (num1+num2));
	}
	
	public void add(int num1,int num2,int num3) {
		System.out.println("The sum is : " + (num1+num2+num3));
	}
	public void add(float num1,float num2) {
		System.out.println("The sum is : " + (num1+num2));
	}
	
	public void add(int num1,float num2) {
		System.out.println("The sum is : (Order1) " + (num1+num2));
	}
	
	public void add(float num1,int num2) {
		System.out.println("The sum is : (Order2) " + (num1+num2));
	}
}

public class OOPS_03_MethodOverloading {
	public static void main(String[] args) {
		Adder add1 = new Adder();
		
		add1.add(10,20);
		add1.add(10,20,30);
		add1.add(10.3f,10.5f);
		add1.add(10,10.5f);
		add1.add(10.5f,10);
	}
}
