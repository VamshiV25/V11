package Loops;
import java.util.Scanner;
public class FibonacciWhile {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of terms");
		int terms=in.nextInt();
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		int count=2;
		while (count<terms) {
			int n3=n1+n2;
			System.out.print(n3+" ");
			count++;
			n1=n2;
			n2=n3;
		}
	}

}
