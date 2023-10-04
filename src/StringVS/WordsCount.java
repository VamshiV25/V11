package StringVS;

public class WordsCount {

	public static void main(String[] args) {
		String str="i am an indian";
		int vowels=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				vowels++;
		}
		System.out.println(vowels);
	}
}
