package Loops;
import java.util.Scanner;
public class HCF {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two Intgers");
		int a=in.nextInt();
		int b=in.nextInt();
		int small=a<b?a:b;
		int f=0;
		for(int n=1;n<=small;n++) {
			if(a%n==0 && b%n==0)
				f=n;
		}
		System.out.println("HCF="+f);
	}

}
