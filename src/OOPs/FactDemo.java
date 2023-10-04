package OOPs;
import java.util.Scanner;
public class FactDemo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an Integer");
		int num=in.nextInt();
		int f=fact(num);	//Method Call
		System.out.println("Factorial Value : "+f);
	}
	public static int fact(int n) {
		int f=1;
		while(n>1) {
			f=f*n;
			n--;
		}
		return f;
	}
} 