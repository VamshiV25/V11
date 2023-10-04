package OOPs;
public class ObjectTest {
	public static void main(String[] args) {
		Test obj=new Test();
		obj.init(10,20);
		System.out.println("before imcrement");
		obj.show();
		obj.increment();
		System.out.println("after increment");
		obj.show();
	}
}
class Test{
	int a,b;
	public void show() {
		System.out.println("a="+a+",b="+b);
	}
	public void init(int x,int y) {
		a=x;
		b=y;
	}
	public void increment() {
		a++;
		b++;
	}
}