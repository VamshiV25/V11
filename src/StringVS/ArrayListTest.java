package StringVS;
import java.util.*;
public class ArrayListTest {
			public static void main(String[] args) {
		    ArrayList mylist=new ArrayList(); //Heterogenious
		    System.out.println("IS List Empty :"+mylist.isEmpty());
		    System.out.println("Size of List :"+mylist.size());
		    System.out.println(mylist);
		    mylist.add(10);
		    mylist.add("Bharath");
		    mylist.add(12.75);
		    mylist.add(true);
		    mylist.add('P');
		    System.out.println("IS List Empty :"+mylist.isEmpty());
		    System.out.println("Size of List  After Adding :"+mylist.size());
		    System.out.println("The List is :");
		    System.out.println(mylist);
		    mylist.clear();
		    System.out.println("The List now is :"+mylist);
		    System.out.println("The size of List :"+mylist.size());
	}
}
