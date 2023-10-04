package Loops;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an Number");
		int num=in.nextInt();
		int rem=0,sum=0;
		int temp=num;
		while(num!=0) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if (temp==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}
}
