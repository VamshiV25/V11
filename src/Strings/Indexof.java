package Strings;

public class Indexof {

	public static void main(String[] args) {
		String str="String Handling in Java";
		System.out.println("the string is : "+str);
		int index=str.indexOf("in");
		System.out.println("the pattern found at : "+index);
		index=str.indexOf("in",4);
		System.out.println("the pattern found at : "+index);
		index=str.indexOf("in",13);
		System.out.println("the pattern found at : "+index);
	}

}
