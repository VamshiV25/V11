package Strings;

public class StrDemo {

	public static void main(String[] args) {
		String str1="Welcome";
		System.out.println("the Strng is : "+str1);
		
		String str2="Hello";
		String str3=new String(str2);
		System.out.println("the obj using another obj : "+str3);
		
		char [] charArray= {'S','t','r','i','n','g','s'};
		String str=new String(charArray);
		System.out.println("The CharArray is : "+str);
	}
}
