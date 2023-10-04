package OOPs;
public class StaticVarDemo {
	public static void main(String[] args) {
		StaticVarDemo obj1=new StaticVarDemo();
		StaticVarDemo obj2=new StaticVarDemo();
		obj1.code=10;
		obj1.count=100;
		obj2.code=20;
		obj2.count=200;
		System.out.println("Obj 1");
		obj1.show();
		System.out.println("Obj 2");
		obj2.show();
	}
	int code;	//instance variable
	public static int count;	//static variable 
	public void show() {
		System.out.println("Instance Variable : "+code);
		System.out.println("Static Variable : "+count);
	}
}
