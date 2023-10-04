package Arrays;
import java.util.Scanner;
public class AEvOdCountScanner {

	public static void main(String[] args) {
		int[]n=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.println("enter Array of elemnts");
		for (int i=0;i<n.length;i++) {
			n[i]=in.nextInt();
		}
		int evens=0,odds=0;
		System.out.println("Array of elemnts");
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
			if (n[i]%2==0)
				evens++;
			else
				odds++;
		}
		System.out.println("\nEven="+evens+"\nOdd="+odds);
	}
}
