package Exceptions;
public class Exp2 {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60};
		int []b= {1,2,3,4,0,6};
		
		try {
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]/b[i]);
			}
		}
		catch(ArithmeticException exp) {
			System.out.println("Division by Zero");
			exp.printStackTrace();
		}
	}
}
