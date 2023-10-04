package IO;
import java.io.*;
public class IO3 {
	public static void main(String[] args) throws Exception {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Value for length");
		String s=in.readLine();
		int length=Integer.parseInt(s);
		System.out.println("Enter value for breadth");
		s=in.readLine();
		int breadth=Integer.parseInt(s);
		int area=length*breadth;
		int per=2*(length+breadth);
		System.out.println("Area : "+area);
		System.out.println("Per : "+per);
	}
}
