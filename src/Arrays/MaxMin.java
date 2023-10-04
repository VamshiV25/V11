package Arrays;
import java.util.Scanner;
public class MaxMin {
	public static void main(String[] args) {
		int[]n=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter array of elements");
		for(int i=0;i<n.length;i++) {
			n[i]=in.nextInt();		
		}
		int max,min;
		max=min=n[0];
		System.out.println("Array of elements");
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		for(int i=1;i<n.length;i++) {
			if(max<n[i])
				max=n[i];
			if(min>n[i])
				min=n[i];
		}
		System.out.println("\nMax="+max+"\nMin="+min);
//		int a=max-min;
//		int b=max+min;
//		System.out.println("Sub="+a+"\nSum="+b);
	}
}
