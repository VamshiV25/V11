package Strings;

public class Reverse {

	public static void main(String[] args) {
		String str1="Hello World";
		String str2=" ";
		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		System.out.println("the string : "+str1);
		System.out.println("Reverse String : "+str2);
	}

}
