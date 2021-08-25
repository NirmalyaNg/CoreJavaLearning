package objectOrientedProgramming;
class MotuHati{
	String name;
	int weight;
	double motaLevel;
	
	public MotuHati(String name,int weight,double motaLevel) {
		this.name = name;
		this.weight = weight;
		this.motaLevel = motaLevel;
	}
	
	@Override
	public String toString() {
		return "Name of MotuHati is " + this.name + " and weight is " + this.weight + " and motulevel is " + this.motaLevel;
	}
}
public class OOPS_25_Overriding_toString_method {
	public static void main(String[] args) {
		MotuHati chottomotu = new MotuHati("Nimu",100,3.0);
		System.out.println(chottomotu.toString());
	}
}
