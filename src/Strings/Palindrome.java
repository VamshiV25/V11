package Strings;

public class Palindrome {

	public static void main(String[] args) {
		String str="malayalam";
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		System.out.println("The String is : "+str);
		System.out.println("Reverse of String : "+str1);
		if(str.equals(str1))
		System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
