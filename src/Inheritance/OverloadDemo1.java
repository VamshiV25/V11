package Inheritance;
public class OverloadDemo1 {
	public static void show(int n) {
		System.out.println("Integer value is : "+n);
	}
	public static void show(double d) {
		System.out.println("Double value is : "+d);
	}
	public static void show(String str) {
		System.out.println("String is : "+str);
	}
	public static void main(String[] args) {
		show(123);
		show(123.45);
		show("Hello World");
	}
}
