package OOPs;
//import java.util.Scanner;
public class PrivateTest {
	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter values of n1,n2");
//		int n1=in.nextInt();
//		int n2=in.nextInt();
		PrivTest priv=new PrivTest();
		priv.init(200,300);
		priv.show();
	}
}
class PrivTest{
	int num1,num2;
	public void init(int n1,int n2) {
		num1=n1;
		num2=n2;
	}
	public void show() {
		System.out.println("Num1 : "+num1);
		System.out.println("Num2 : "+num2);
	}
}