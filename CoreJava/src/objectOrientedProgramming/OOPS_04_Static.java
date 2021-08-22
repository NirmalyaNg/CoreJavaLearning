package objectOrientedProgramming;

class Employee{
	// Instance attribute
	String name;
	int empId;
	double salary;
	
	// Static attribute
	
	static int count;
	
	public Employee(String name,int empId,double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		
		Employee.count++;
	}
	
	public void display() {
		System.out.println("Name : " + this.name);
		System.out.println("Employee Id : " + this.empId);
		System.out.println("Salary : " + this.salary);
	}
	
	public static int getNumberOfEmployees() {
		return Employee.count;
		
		// Static method can't use this
		// Static method can be called even before we create ant object of the class
		
	}
}

public class OOPS_04_Static {
	public static void main(String[] args) {
		System.out.println(Employee.getNumberOfEmployees());
		
		Employee emp1 = new Employee("Nirmalya",1474147,21000);
		Employee emp2 = new Employee("Sampriti",1452257,22500);
		Employee emp3 = new Employee("Tubai",1122589,20500);
		
		System.out.println("Number of employees : " + Employee.count);
	}
}
