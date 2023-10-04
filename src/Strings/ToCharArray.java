package Strings;

public class ToCharArray {

	public static void main(String[] args) {
		String str="Hello World";
		char[]charArray=str.toCharArray();
		for (char c:charArray) {
			System.out.print(c);
		}
		System.out.println(str.length());
	}

}