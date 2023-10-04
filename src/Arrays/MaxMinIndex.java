package Arrays;
import java.util.Scanner;
public class MaxMinIndex {

	public static void main(String[] args) {
		int []arr=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Array Elemnts");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		int max,min;
		max=min=arr[0];
		int minIndex,maxIndex;
		minIndex=maxIndex=-1;
		System.out.println("Array Elements");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				maxIndex=i;
			}
			if(min>arr[i]) {
				min=arr[i];
				minIndex=i;
			}
		}
		System.out.println();
		System.out.printf("max value=%d & maxIndex=%d",max,maxIndex);
		System.out.printf("min value=%d & minIndex=%d",min,minIndex);
	}

}
