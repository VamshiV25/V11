package StringVS;

public class StringSplit {

	public static void main(String[] args) {
		String str="String Handling in Java";
		String []words=str.split("");
		/*for (int i=0;i<words.length;i++) {
			System.out.print(words[i]);
		}*/
		for(String w:words) {
			System.out.print(w);
		}
	}

}
