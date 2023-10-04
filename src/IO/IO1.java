package IO;
public class IO1 {
	public static void main(String[] args) throws Exception {
		StringBuffer sb=new StringBuffer();
		int c;
		System.out.println("Type Characters and press ENTER to Exit");
		while((c=System.in.read())!='\n') {
			sb.append((char)c);
		}
		System.out.println("The Input Characters are");
		System.out.println(sb);
	}
}
