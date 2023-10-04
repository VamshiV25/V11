package Strings;
public class Stringbuffer {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Java");
		System.out.println("object is : "+sb);
		sb.append(" Language");
		System.out.println("object after append : "+sb);
		sb.insert(5,"Programming ");
		System.out.println("object after insert : "+sb);
		
		StringBuffer sb1=new StringBuffer("Hello World");
		System.out.println("the new object is : "+sb1);
		System.out.println("reversing it : "+sb1.reverse());
	}
}
