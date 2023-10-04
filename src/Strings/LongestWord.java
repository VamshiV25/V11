package Strings;

public class LongestWord {

	public static void main(String[] args) {
		String str="String Handling in Java";
		System.out.println(" "+str);
		String[]words=str.split(" ");
		int len=words[0].length();
		String longest=words[0];
		for(int i=1;i<words.length;i++) {
		if(len<words[i].length())
			longest=words[i];
	   }
		System.out.println("Longest Word : "+longest);
	}
}
