package Arrays;

public class ASumReverse {

	public static void main(String[] args) {
		int[]n=new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		System.out.println("Array of elements");
		for(int i=n.length-1;i>=0;i--) {
			System.out.print(n[i]+" ");
			sum=sum+n[i];
		}
		  System.out.println("\nSum="+sum);
	}
}
