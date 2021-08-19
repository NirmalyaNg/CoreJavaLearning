package javaLearning;

class TCSEmployee{
	// Instance Attribute
	String empName;
	double empSalary;
	String designation;
	{
		empSalary = 10000;
	}
	
	// Static Attribute
	static String orgName;
	static String orgType;
	
	static {
		orgName = "TCS";
		orgType = "Service-Based";
	}
	
}

public class OOPS_05_InitializationBlocks {
	public static void main(String[] args) {
		TCSEmployee emp1 = new TCSEmployee();
		TCSEmployee emp2 = new TCSEmployee();
		TCSEmployee emp3 = new TCSEmployee();
	}
}
