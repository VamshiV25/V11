package OOPs;
import java.util.Scanner;
public class MaxMinIndex {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter array Elements");
		int []arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		int max,min;
		max=min=arr[0];
		int maxIndex,minIndex;
		maxIndex=minIndex=0;
		System.out.println("Array Elemnts are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				maxIndex=i;
			}
			if(min>arr[i]) {
				min=arr[i];
				minIndex=i;
			}
		}
		System.out.println("Max : "+maxIndex+"\nMin : "+minIndex);
	}
}
