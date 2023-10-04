package Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int[][]n=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0;i<n.length;i++) {
			for(int j=0;j<n[0].length;j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
//		to print transpose
		System.out.println("\nTranspose of Array");
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[0].length;j++) {
				System.out.print(n[j][i]+" ");
			}
			System.out.println();
		}
	}

}