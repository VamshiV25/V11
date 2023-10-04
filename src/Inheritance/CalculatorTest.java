package Inheritance;
import java.util.Scanner;
public class CalculatorTest {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 2 Double Values");
		double d1=in.nextDouble();
		double d2=in.nextDouble();
		System.out.printf("D1=%f,D2=%f\n",d1,d2);
		CalcImpl cal=new CalcImpl();
		System.out.printf("D1+D2=%f\n",cal.add(d1,d2));
		System.out.printf("D1-D2=%f\n",cal.sub(d1,d2));
		System.out.printf("D1*D2=%f\n",cal.mul(d1,d2));
		System.out.printf("D1/D2=%f\n",cal.div(d1,d2));
	}
}
interface Calc1{
	public double add(double d1,double d2);
    public double sub(double d1,double d2);
}
interface Calc2{
	public double mul(double d1,double d2);
	public double div(double d1,double d2);
}
class CalcImpl implements Calc1,Calc2{
	public double add(double d1,double d2) {
		return d1+d2;
	}
	public double sub(double d1,double d2) {
		return d1-d2;
	}
	public double mul(double d1,double d2) {
		return d1*d2;
	}
	public double div(double d1,double d2) {
	return d1/d2;
	}
}