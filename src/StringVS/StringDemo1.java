package StringVS;
import java.util.Scanner;
public class StringDemo1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=in.nextLine();
		System.out.print("the name is : "+str);
		System.out.println("\nlenght of the String is : "+str.length());
	}
}
