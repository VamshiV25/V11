package OOPs;
import java.util.Random;
import java.util.Arrays;
public class ArrDemo1 {
	public static void main(String[] args) {
		int []arr=new int[10];
		Random rand=new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i]=rand.nextInt(100);
		}
		System.out.println("Array Values");
		printArray(arr);
		int []result=sortArray(arr);
		System.out.println("\nArray values after Sorting");
		printArray(result);
	}
	public static void printArray(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int []sortArray(int []arr){
		Arrays.sort(arr);
		return arr;
	}
}
