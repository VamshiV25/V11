package IO;
import java.io.*;
public class IO6 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Vamsi\\OneDrive\\Desktop\\myfile2.txt");
		String str="This Information is appended to the File";
		byte []buffer=str.getBytes();
		fos.write(buffer);
		System.out.println("Information appended to the File");
		fos.close();
	}
}
