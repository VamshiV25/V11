package Strings;

public class Revers {

	public static void main(String[] args) {
		/*String str="Hello World";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}*/
		
		String str="Hello World";
		char []a=str.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		System.out.print(a[i]);
	}

}
