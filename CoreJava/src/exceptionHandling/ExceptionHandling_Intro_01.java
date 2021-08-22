package exceptionHandling;
import java.util.Scanner;

public class ExceptionHandling_Intro_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			System.out.println("Some error occured !!");
		}
		System.out.println("Hii");
		
	}
}
