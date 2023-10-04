package IO;
public class IO2 {
	public static void main(String[] args) throws Exception{
		byte []buffer=new byte[100];
		System.out.println("Type Characters and press ENTER to Exit");
		System.in.read(buffer);
		String str=new String(buffer);
		System.out.println("The Input Characters are");
		System.out.println(str);
	}
}
