package Loops;
import java.util.Scanner;
public class MultiTable {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an Integer");
		int n=in.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}

}
