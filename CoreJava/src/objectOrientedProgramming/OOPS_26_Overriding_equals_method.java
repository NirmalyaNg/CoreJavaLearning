package objectOrientedProgramming;

class Student5{
	String name;
	int rollNumber;
	int cls;
	
	public Student5(String name,int rollNumber,int cls) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.cls = cls;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Student5 s = (Student5)(obj); // DownCasting
		if(this.cls == s.cls && this.rollNumber == s.rollNumber) {
			return true;
		}
		
		return false;
	}
	
	
}

public class OOPS_26_Overriding_equals_method {
	public static void main(String[] args) {
		Student5 s1 = new Student5("Nirmalya",30,5);
		Student5 s2 = new Student5("Sampriti",26,5);
		Student5 s3 = new Student5("Momai",26,5);
		Student5 s4 = s2;
		
		
		System.out.println(s4.equals(s2));  // true since they both refer to same objects
		System.out.println(s3.equals(s2));  // false since although both have same values for attributes but they are different objects
	}
}
