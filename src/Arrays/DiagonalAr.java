package Arrays;

public class DiagonalAr {

	public static void main(String[] args) {
		/*int[][]n= {{1,2,3},{4,5,6},{7,8,9}};
		  for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[0].length;j++) {
				if (i==j)
				System.out.print(" "+n[j][i]);
			}
			System.out.println();
		}
		*/int[][]n= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i][i]+" ");
		}
	}
}

