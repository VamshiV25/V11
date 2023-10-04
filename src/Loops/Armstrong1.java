package Loops;
import java.util.Scanner;
public class Armstrong1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an Integer");
		int num=input.nextInt();
		int temp=num,temp1=num,digits=0;
		while(num!=0) {
			digits++;
			num=num/10;
		}
		int sum=0;
		while(temp!=0) {
		  int rem=temp%10;
		  sum=sum+(int)Math.pow(rem,digits);
		  temp=temp/10;
		}
		if(sum==temp1)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}

}
