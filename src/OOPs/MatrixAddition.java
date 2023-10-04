package OOPs;
public class MatrixAddition {  
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] B = {{7, 8, 9}, {10, 11, 12}};
        
        int[][] C = addMatrices(A, B);
        
        System.out.println("Matrix A:");
        printMatrix(A);
        
        System.out.println("Matrix B:");
        printMatrix(B);
        
        System.out.println("Matrix C = A + B:");
        printMatrix(C);
    }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }  
    public static void printMatrix(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}

