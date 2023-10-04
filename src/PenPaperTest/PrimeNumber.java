package PenPaperTest;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower and Higher limits");
		int lower=sc.nextInt();
		int higher=sc.nextInt();		
		for(int n=lower;n<=higher;n++) {
			int factors=0,temp=n;
			for(int i=1;i<=temp;i++) {
				if(temp%i==0)
				factors++;			
			}				
			if(factors==2)
				System.out.println(" "+temp);
		}
	}	
}
