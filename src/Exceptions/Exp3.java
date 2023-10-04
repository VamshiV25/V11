package Exceptions;
public class Exp3 {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70};
		int []b= {1,2,3,4,0,6};
		
		try {
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]/b[i]);
			}
		}
		catch(ArithmeticException exp) {
			System.out.println("Division By Zero");
			exp.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException exp) {
			System.out.println("Invalid Array Index");
			exp.printStackTrace();
		}
	}
}
