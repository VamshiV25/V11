//package OOPs;
//import java.util.Scanner;
//public class TestRectangle {
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		Rectangle rect=new Rectangle();
//		System.out.println("Enter l & b");
//		int l=in.nextInt();
//		int b=in.nextInt();
//		rect.setDimensions(l,b);
//		System.out.println("Area :"+rect.area());
//		System.out.println("Per : "+rect.per());
//	}
//}
//class Rectangle{
//	int length,breadth;
//	public void setDimensions(int l,int b) {
//		this.length=l;
//		this.breadth=b;
//	}
//	public int area() {
//		return length*breadth;
//	}
//	public int per() {
//		return 2*(length+breadth);
//	}
//}