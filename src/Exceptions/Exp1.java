package Exceptions;
public class Exp1 {
	public static void main(String[] args) {
		int []arr=new int[] {1,2,3,4,5,6,7,8};
		int sum=0;
		try {
			for(int i=0;i<=arr.length;i++) {
				System.out.print(arr[i]+" ");
				sum=sum+arr[i];
			}
			System.out.println("\nThe Sum is : "+sum);
		}
		catch(ArrayIndexOutOfBoundsException exp) {
			System.out.println("\nInvalid Array Index");
			System.out.println("Caught : "+exp);
			exp.printStackTrace();
		}
	}
}
