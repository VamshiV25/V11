package Loops;

public class NestedLoop {

	public static void main(String[] args) {
		/*for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		*/
		/*for (int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
		/*for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	/*	for(int i=5;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		int count=1;
		for(int i=1;i<=15;i++) {
			for(int j=1;j<=i;j++,count++) {
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
}
