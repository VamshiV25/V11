package OOPs;
import java.util.Scanner;
public class TestCircle2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter radius");
		double rad=in.nextDouble();
		calculate(rad);
	}
	public static void calculate(double radius) {
		double area=radius*radius*3.14;
		double per=2*3.14*radius;
		System.out.println("Area : "+area+"\nCir : "+per);
	}
}
