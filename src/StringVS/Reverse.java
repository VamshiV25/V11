package StringVS;

public class Reverse {

	public static void main(String[] args) {
		String str="Hello World";
		/*char []CharArray=str.toCharArray();
		for(char ch:CharArray) {
			System.out.print(ch);
		}*/
		/*for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}*/
		/*for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}*/
		char []arr=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}

}
