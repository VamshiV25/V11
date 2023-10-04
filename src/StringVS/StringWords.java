package StringVS;

public class StringWords {

	public static void main(String[] args) {
		String str="String Handling in Java";
		System.out.println("the String is : "+str);
		System.out.println("words of the String is : ");
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c==' ')
			System.out.println();
			else
				System.out.print(c);
		}

	}

}
