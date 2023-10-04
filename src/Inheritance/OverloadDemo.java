package Inheritance;
public class OverloadDemo {
	public static double add(double d1,double d2) {
		System.out.println("Add with 2 Arguments");
		return d1+d2;
	}
	public static double add(double d1,double d2,double d3) {
		System.out.println("Add with 3 arguments");
		return d1+d2+d3;
	}
	public static void main(String[] args) {
		double d1=12.75,d2=17.25,d3=28.75;
		System.out.println("Sum of 2 Double Values = "+add(d1,d2));
		System.out.println("Sum of 3 Double values = "+add(d1,d2,d3));
	}
}
