package OOPs;
import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value of radius");
		double rad=in.nextDouble();
		calculate(rad);
	}
	public static void calculate(double radius) {
		double area=3.14*radius*radius;
		double per=2*3.14*radius;
		System.out.println("Area : "+area);
		System.out.println("Per : "+per);
	}
}
