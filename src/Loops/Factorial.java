package Loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an integer");
		int num=in.nextInt();
		int f=1;
		for(int n=1;n<=num;n++) {
			f=f*n;
		}
		System.out.println("Factorial Value="+f);
	}

}


