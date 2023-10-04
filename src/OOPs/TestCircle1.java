package OOPs;
import java.util.Scanner;
public class TestCircle1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value of radius");
		double rad=in.nextDouble();
		System.out.println("Area : "+area(rad));
		System.out.println("cir : "+per(rad));
		
	}
	public static double area(double radius) {
		return 3.14*radius*radius;
	}
	public static double per(double radius) {
		return 2*3.14*radius;
	}
}
