package objectOrientedProgramming;
class Student{
	private String studentName;
	private int studentId;
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setStudentId(int id) {
		this.studentId = id;
	}
	
	public void display() {
		System.out.println("Student Name : " + this.studentName + " and id : " + this.studentId);
	}
}
public class OOPS_01_ClassObject {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentId(101);
		student1.setStudentName("Nirmalya");
		student1.display();
	}
}
