package PenPaperTest;
import java.util.Scanner;
public class SumDifferenceArray {

	public static void main(String[] args) {
		int []arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array of Elements");
		int max,min=0;
		min=max=arr[0];
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		if(max<arr[i])
			max=arr[i];
		if(min>arr[i])
			min=arr[i];
		}
		System.out.println("\nMax="+max+"\nMin="+min);
		int a=max+min;
		int b=max-min;
		System.out.println("Sum="+a+"\nDiff="+b);
	}
}
