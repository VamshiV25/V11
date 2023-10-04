package Strings;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter 2 Strings");
		String s1=in.next();
		String s2=in.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char [] a1=s1.toCharArray();
		char [] a2=s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		s1=new String(a1);
		s2=new String(a2);
		if(s1.equals(s2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}

}
