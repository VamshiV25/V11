package Arrays;

public class AEvenOddCount {

	public static void main(String[] args) {
		int[]n=new int[] {1,2,3,4,5,6,7,8,9,10};
		int evens=0,odds=0;
		System.out.println("Array of Elements");
		for(int i=0;i<n.length;i++) {
			System.out.print(" "+n[i]);
			if (n[i]%2==0)
				evens++;
			else
				odds++;
		}
		System.out.println("\nEven count : "+evens+"\nOdd count : "+odds);
	}
}
