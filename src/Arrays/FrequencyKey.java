package Arrays;
import java.util.Scanner;
public class FrequencyKey {
	public static void main(String[] args) {
		int [] n=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Array elemnts");
		for (int i=0;i<n.length;i++) {
			n[i]=in.nextInt();
		}
		System.out.println("Enter the Key elemnt");
		int key=in.nextInt();
		int frequency=0;
		for (int i=0;i<n.length;i++) {
			if(n[i]==key)
				frequency++;
		}
		System.out.println("the freq of "+key+" in the array is :"+frequency);
	}

}
