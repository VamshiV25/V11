package Loops;
import java.util.Scanner;
public class LCM {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two Integers");
		int a=in.nextInt();
		int b=in.nextInt();
		int hcf=0;
		int small=a<b?a:b;
		for(int i=1;i<=small;i++) {
			if(a%i==0 && b%i==0)//i is the foctor of a number
				hcf=i;
		}
		//formula for lcm is
		 //LCM=(Product of numbers/HCF)
		int lcm=(a*b)/hcf;
		System.out.println("LCM="+lcm);
	}
}
