package PenPaperTest;
import java.util.Scanner;
public class EvenOddCount {
	public static void main(String[] args) {
		int [] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int evens=0,odds=0;
		System.out.println("Array Values");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0)
				evens++;
			else
				odds++;
		}
		System.out.println("Even Count : "+evens+"\nOdd Count : "+odds);
	}

}
