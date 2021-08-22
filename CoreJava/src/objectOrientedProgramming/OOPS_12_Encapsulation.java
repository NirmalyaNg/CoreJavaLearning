package objectOrientedProgramming;

class Customer{
	private int cid;
	private double balance;
	
	public int getCid() {
		return this.cid;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
}


public class OOPS_12_Encapsulation {
	public static void main(String[] args) {
		Customer customer = new Customer();
		// customer.balance = 1000000; --> Error
		customer.setBalance(10000);
		System.out.println(customer.getBalance());
	}
}
