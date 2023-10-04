package OOPs;
import java.util.Scanner;
public class TestRectangle2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter values of l and b");
		int l=in.nextInt();
		int b=in.nextInt();
		calculate(l,b);
	}
	public static void calculate(int length,int breadth) {
		int area=length*breadth;
		int per=2*(length+breadth);
		System.out.println("Area : "+area);
		System.out.println("Per : "+per);
	}
}
