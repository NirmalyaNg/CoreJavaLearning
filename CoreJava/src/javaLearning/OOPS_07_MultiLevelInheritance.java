package javaLearning;
class GrandFather{
	protected int gp = 100000;
}
class Father2 extends GrandFather{
	protected int fp = 1500000;
}

class Daughter extends Father2{
	protected int dp = 10000000;
}


public class OOPS_07_MultiLevelInheritance {
	public static void main(String[] args) {
		Daughter sampriti = new Daughter();
		System.out.println(sampriti.dp);
		System.out.println(sampriti.fp);
		System.out.println(sampriti.gp);
	}
}
