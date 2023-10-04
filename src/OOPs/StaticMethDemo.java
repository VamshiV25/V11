package OOPs;
public class StaticMethDemo {
	public static void main(String[] args) {
		StaticMethDemo obj=new StaticMethDemo();
		obj.code=10;
		obj.count=100;
		obj.show();
		obj.showCount();
	}
	int code;
	static int count;
	public void show() {
		System.out.println("Instance variable : "+code);
		System.out.println("Static Variable : "+count);
	}
	public static void showCount() {
		System.out.println("Static variable using static method : "+count);
	}
}
