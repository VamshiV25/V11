package Exceptions;
public class Exp5 {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70};
		int []b= {1,2,3,4,5,7,6};

		try {
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			System.out.println("Num1 : "+num1);
			System.out.println("Num2 : "+num2);
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]/b[i]);
			}	
		}
		catch(ArithmeticException exp) {
			System.out.println("Division by Zero");
			exp.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException exp) {
			System.out.println("Invalid Array Index");
			exp.printStackTrace();
		}
		catch(Exception exp) {
			System.out.println("Caught : "+exp);
		}
	}
}