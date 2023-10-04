package Arrays;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		int[][]a=new int[3][3];
		int[][]b=new int[3][3];
		int[][]c=new int[3][3];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter values for 1st Array");
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				a[i][j]=in.nextInt();
			}
		}
			System.out.println("\nEnter Values for 2nd Array");
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<b[0].length;j++) {
					b[i][j]=in.nextInt();
					c[i][j]=a[i][j]+b[i][j];
			}
		}
			System.out.println("\nArray Result");
			for(int i=0;i<c.length;i++) {
				for(int j=0;j<c[0].length;j++) {
					System.out.print(c[i][j]+" ");
				}
			}
			System.out.println();
	}
}
