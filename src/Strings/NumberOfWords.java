package Strings;

public class NumberOfWords {

	public static void main(String[] args) {
		String str="String Handling in Java";
		int words=1;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if (c==' ')
				words++;
		}
		System.out.println("Number of words : "+words);
	}

}
