package Strings;

public class ReverseStringWords {

	public static void main(String[] args) {
		String str="String Handling in Java";
		System.out.println("the String is : "+str);
		String []words=str.split(" "); 
		for(int i=0;i<words.length;i++) {
			String s=words[i];
			String rev="";
			for (int j=s.length()-1;j>=0;j--) {
				rev=rev+s.charAt(j);
			}
			System.out.print(rev+" ");
		}		
	}
}
