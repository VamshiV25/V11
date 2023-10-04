package Arrays;
import java.util.Random;
public class BubbleSort {

	public static void main(String[] args) {
		int []n=new int[10];
		Random rand=new Random();
		for(int i=0;i<n.length;i++) {
			n[i]=rand.nextInt(100);
		}
		System.out.println("Array values");
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		//Sort logic
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length-1-i;j++) {   	// n.length-1-i
				if(n[j]>n[j+1]) {
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
			}
		}
	}
		System.out.println("\nArray values after sorting");
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
	}
}