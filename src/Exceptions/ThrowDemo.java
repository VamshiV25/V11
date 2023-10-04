package Exceptions;
import java.util.Scanner;
public class ThrowDemo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Dividend");
		int dividend=in.nextInt();
		System.out.println("Enter a Divisior");
		int divisior=in.nextInt();
		if(divisior==0) {
			throw new ArithmeticException("cannot divided by Zero");
		}
		int result=dividend/divisior;
		System.out.println("Result : "+result);
	}
}
