package objectOrientedProgramming;

/* When a child class inherits from a parent class and we create an object of the child class
 * the parent class's non-parameterized constructor is invoked implicitly and after that the 
 * constructor of the child class is invoked.
 * However if we want to invoke the parent class parameterized constructor from child class constructor
 * we need to do that explicitly using super keyword.
 * */

class Vehicle{
	protected String vehicleType;
	protected int numberOfWheels;
	
	public Vehicle() {
		System.out.println("Parent class Non Parameterized constructor called");
	}
	
	public Vehicle(String vehicleType,int numberOfWheels) {
		this.vehicleType = vehicleType;
		this.numberOfWheels = numberOfWheels;
	}
}

class Car extends Vehicle{
	private String brandName;
	private String color;
	private double price;
	
	public Car(String vehicleType,int numberOfWheels,String brandName,String color,double price) {
		super(vehicleType,numberOfWheels);
		this.brandName = brandName;
		this.color = color;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Brand Name : " + this.brandName);
		System.out.println("Color : " + this.color);
		System.out.println("Price : " + this.price);
		System.out.println("Vehicle Type : " + this.vehicleType);
		System.out.println("Number of wheels : " + this.numberOfWheels);
	}
}


public class OOPS_09_Constructors_In_Inheritance {
	public static void main(String[] args) {
		Car car1 = new Car("4-Wheeler",4,"Ford","Black",1300000);
		car1.display();
	}
}
