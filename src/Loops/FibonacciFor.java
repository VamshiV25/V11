package Loops;
import java.util.Scanner;
public class FibonacciFor {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("Enter number of terms");
		int terms=in.nextInt();
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<terms;i++) {
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}
