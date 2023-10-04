package OOPs;
public class StaticBlockDemo {
	public static void main(String[] args) {
		StaticBlockDemo obj1=new StaticBlockDemo();
		StaticBlockDemo obj2=new StaticBlockDemo();
	}
	static {
		System.out.println("Static Block Executed");
		System.out.println("Executed before main");
	}
	{
		System.out.println("non static block executed");
		System.out.println("executed for every instance");
	}
}
