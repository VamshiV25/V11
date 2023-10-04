package OOPs;
import java.util.Scanner;
public class Circle1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value for Radius");
		double rad=in.nextDouble();
		System.out.println("Area : "+area(rad));
		System.out.println("Per : "+per(rad));
	}
	public static double area(double radius) {
		return 3.14*radius*radius;
	}
	public static double per(double radius) {
		return 3.14*2*radius;
	}
}
