package OOPs;
import java.util.Scanner;
public class RectangleTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Values For Length and Breadth");
		int l=sc.nextInt();
		int b=sc.nextInt();
		Rectangle rect=new Rectangle();
		rect.setDimensions(l,b);
		System.out.println("Area : "+rect.area());
		System.out.println("Per : "+rect.per());
	}
}
class Rectangle{
	int length,breadth;
	public void setDimensions(int l,int b) {
		length=l;
		breadth=b;
	}
	public int area() {
		return length*breadth;	
	}
	public int per() {
		return 2*(length+breadth);
	}
}