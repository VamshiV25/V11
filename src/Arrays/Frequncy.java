package Arrays;
import java.util.Scanner;
public class Frequncy {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int []a=new int[10];
		System.out.println("Array Elements are");
		for(int i=0;i<a.length;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("enter the key element");
		int key=in.nextInt();
		int frequency=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				frequency++;
			}
		}
		System.out.println("the frequency of "+key+" in the array is "+frequency);
	}

}
