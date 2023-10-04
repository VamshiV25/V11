package Exceptions;
import java.util.Scanner;
public class ThrowDemo2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter values dividend and divisior");
		int dividend=in.nextInt();
		int divisior=in.nextInt();
		try {
			int result=divide(dividend,divisior);
			System.out.println("Result : "+result);
		}
		catch(ArithmeticException exp) {
			System.out.println("Division by Zero");
			System.out.println(exp.getMessage());
	}
}
public static int divide(int dividend,int divisior)throws ArithmeticException{
		if (divisior==0) {
			throw new ArithmeticException("Cannot Divide by Zero");
		}
		return dividend/divisior;
	}
}