package IO;
import java.io.*;
public class IO5 {
	public static void main(String[] args) throws Exception {
		FileWriter writer=new FileWriter("C:/Users/Vamsi/OneDrive/Desktop/myfile1.txt");
		String str="Writing Information to File Using Output Streams ";
		char []charArray=str.toCharArray();
		writer.write(charArray);
		System.out.println("Information Written to the File");
		writer.close();
	}
}
