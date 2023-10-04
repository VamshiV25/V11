package OOPs;
import java.util.Scanner;
public class TestRectangle1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter l and breadth");
		int l=in.nextInt();
		int b=in.nextInt();
		System.out.println("Area : "+area(l,b));
		System.out.println("Per : "+per(l,b));
	}
	public static int area(int length,int breadth) {
		return length*breadth;
	}
	public static int per(int length,int breadth) {
		return 2*(length+breadth);
	}
}
