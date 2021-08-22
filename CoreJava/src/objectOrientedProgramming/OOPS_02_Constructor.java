package objectOrientedProgramming;

class Student1{
	int id;
	String name;
	int age;
	
	public Student1(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}


public class OOPS_02_Constructor {
	public static void main(String args[]) {
		Student1 student1 = new Student1(101,"Nirmalya",22);
		Student1 student2 = new Student1(102,"Sampriti",21);
		
		// Default values of attributes
		/*
		System.out.println(student1.id);
		System.out.println(student1.name);
		System.out.println(student1.age);
		
		student1.age = 22;
		student1.name = "Nirmalya";
		student1.id = 101;
		
		// Initialization of attributes directly
		
		System.out.println(student1.id);
		System.out.println(student1.name);
		System.out.println(student1.age);
		*/
		System.out.println(student1.id);
		System.out.println(student1.name);
		System.out.println(student1.age);
		
		System.out.println(student2.id);
		System.out.println(student2.name);
		System.out.println(student2.age);
		
	}
}
