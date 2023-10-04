package Loops;

public class EvenOdd {

	public static void main(String[] args) {
		int esum=0,osum=0;
		for(int n=1;n<=10;n++) {
			System.out.print(n+" ");
			if(n%2==0) {
				esum=esum+n;
			}
			else
				osum=osum+n;
		}
		System.out.println("\nEsum="+esum);
		System.out.println("Osum="+osum);
	}

}
