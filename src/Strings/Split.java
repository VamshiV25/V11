package Strings;

public class Split {

	public static void main(String[] args) {
		String str="String Handling in Java";
		String []words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
	}

}
