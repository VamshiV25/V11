package OOPs;
import java.util.Scanner;
public class StrongTest {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an Integer");
		int num=in.nextInt();
		if(isStrong(num))
			System.out.println(num+" is a Strong Number");
		else
			System.out.println(num+" is not a Strong Number");
	}
	public static boolean isStrong(int num) {
		int factsum=0,temp=num;
		while(num!=0) {
			int rem=num%10;
			int f=fact(rem);
			factsum=factsum+f;
			num=num/10;
		}
		if(factsum==temp)
			return true;
		else
			return false;
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
