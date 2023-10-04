package Arrays;

public class ASumEnhanced {

	public static void main(String[] args) {
		int[]n=new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array of elements");
		int sum=0;
		for(int item:n) {
			System.out.print(item+" ");
			sum=sum+item;
		}
		System.out.println("\nSum of elements="+sum);
	}

}
