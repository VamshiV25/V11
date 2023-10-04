package PenPaperTest;
import java.util.Scanner;
public class SumEven_ProdOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer");
		int num=sc.nextInt();
		int esum=0,prod=1;
		while(num!=0) {
			int rem=num%10;
			if(rem%2==0)
				esum=esum+rem;
			else
				prod=prod*rem;
			num=num/10;
		}
		System.out.println("Sum of even Digits:"+esum+"\nProduct of Odd Digits:"+prod);
	}
}
