package Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class BinarySearch {

	public static void main(String[] args) {
		int []n=new int[10];
		Random rand=new Random();
		//generate the array
		for(int i=0;i<n.length;i++) {
			n[i]=rand.nextInt(100);
		}
		Arrays.sort(n);
		System.out.println("Arrays Elements ");
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		Scanner in=new Scanner(System.in);
		System.out.println("\nEnter key element");
		int key=in.nextInt();
		boolean found=false;
		int lower=0,upper=n.length-1;
		while(upper>=lower) {
			int midpos=(upper+lower)/2;
			if (key==n[midpos]) {
				found=true;
				break;
			}
			else if(key<n[midpos])
				upper=midpos-1;
			else
				lower=midpos+1;
		}
		if(found)
		System.out.println("Search Successful");
		else
		System.out.println("Sesrch Failed");

	  }		
   }
			