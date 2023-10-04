package OOPs;
public class Finalize {
	public static void main(String[] args) {
		ClassTest obj=new ClassTest();
		System.out.println("Address of Object : "+obj.hashCode());
		obj=null;
		System.gc();
	}
}
class ClassTest{
	public ClassTest() {
		System.out.println("Constructor Called..");
	}
	protected void finalize() {
		System.out.println("Finalizer Called..");
	}
}