package StringVS;
import java.util.Scanner;
public class Stringadd {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an String");
		String str1=in.next();
		String str2="";
		for(int i=0;i<str1.length();i++){
			System.out.print(str1.charAt(i));
		}
		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		System.out.print("\nreverse of string : "+str2);
		if(str2.equals(str1))
			System.out.println("\nPalindrom");
		else
			System.out.println("\nNot Palindrome");
	}

}
