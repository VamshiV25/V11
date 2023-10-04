package Arrays;

public class RevDiagonal {

	public static void main(String[] args) {
		int[][]n= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0,j=2;i<3;i++,j--) {
			System.out.print(n[i][j]+" ");
		}
	}

}
