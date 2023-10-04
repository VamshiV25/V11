package Loops;
import java.util.Scanner;
public class WCountDigits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an Integer");
		int num=in.nextInt();
		int digits=0;
		while(num!=0) {
			digits++;
			num=num/10;
		}
		System.out.println("Digits="+digits);
	}

}
