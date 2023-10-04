package Exceptions;
import java.util.Scanner;
public class UserDefExp {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an Integer between 1-10");
		
		try {
			int num=in.nextInt();
			if(num>10 || num<1) {
				throw new MyException(num);
			}
			else {
				System.out.println("Input is With in in the Ranger");
			}
		}
		catch(MyException exp) {
			System.out.println(exp);
		}
	}
}
class MyException extends Exception{
	int num;
	public MyException(int num) {
		this.num=num;
	}
	public String toString() {
		return "MyException["+num+"]";
	}
}