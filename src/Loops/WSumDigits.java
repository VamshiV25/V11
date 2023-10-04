package Loops;
import java.util.Scanner;
public class WSumDigits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any Integer");
		int num=in.nextInt();		
		int rem=0,sum=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;			
		}
		System.out.println("Sum="+sum);
	}
}
