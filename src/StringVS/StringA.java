package StringVS;

public class StringA {

	public static void main(String[] args) {
		/*String str="Hello World";
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}*/
		String str="Hello World";
		System.out.println("Using toCharArray");
		char []CharArray=str.toCharArray();
		for(char ch:CharArray) {
			System.out.print(ch);
		}
	}

}
