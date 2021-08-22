package objectOrientedProgramming;
class TCSEmployeeClass{
	private String name;
	private int empId;
	private final String organization = "TCS";
	
	public TCSEmployeeClass(String name,int empId) {
		this.name = name;
		this.empId = empId;
		// this.organization = "Google";  --> Error since attribute is declared as final
	}
	
	public void display() {
		System.out.println("Name of employee is " + this.name);
		System.out.println("Employee Id is " + this.empId);
		System.out.println("Organization Name is " + this.organization);
	}
}
public class OOPS_14_Final_Attribute {
	public static void main(String[] args) {
		TCSEmployeeClass emp1 = new TCSEmployeeClass("Nirmalya",1474145);
		emp1.display();
	}
}
