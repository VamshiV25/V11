package StringVS;

public class LongestString {

	public static void main(String[] args) {
		String str="String Handling in Java";
		String[]words=str.split(" ");
		int len=words[0].length();
		String longest=words[0];
		for(int i=0;i<words.length;i++) {
			if(len<words[i].length())
				longest=words[i];
		}
		System.out.println(longest);
	}
}
