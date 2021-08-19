package javaLearning;

class Person{
	String name;
	int age;
	double salary;
	String organization;
	
	public Person(String name,int age,double salary,String organization) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.organization = organization;
	}
	
	public Person(String name,int age) {
		this(name,age,0.0,null);
		// this() is used to call another constructor of same class
		// this() should be the first statement of the constructor
		/*
		this.name = name;
		this.age = age;
		*/
	}
	public Person(String name,int age,String organization) {
		this(name,age,0.0,organization);
	}
	
	public void display() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Organization : " + this.organization);
		System.out.println("Salary : " + this.salary);
	}
}


public class OOPS_02_ConstructorOverloading {
	public static void main(String[] args) {
		Person person1 = new Person("Nirmalya",22,21000,"TCS");
		Person person2 = new Person("Sampriti",21);
		Person person3 = new Person("Momai",21,"WIPRO");
	}
}
