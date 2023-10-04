package Loops;

public class EvenSum {

	public static void main(String[] args) {
		int num=0;
		int sum=0;
		for(num=1;num<=10;num++) {
			System.out.print(num+" ");
			sum=sum+num;
		}
		System.out.println("\nEven Sum="+sum);
	}

}
