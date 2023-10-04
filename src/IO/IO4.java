package IO;
import java.io.*;
public class IO4 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\Vamsi\\OneDrive\\Desktop\\myfile.txt");
		System.out.println("File Succesfully Opened");
		System.out.println("File Content");
		int c;
		while((c=fis.read())!=-1) {
			System.out.print((char)c);
		}
		fis.close();
	}
}
