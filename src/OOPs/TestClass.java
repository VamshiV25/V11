package OOPs;
public class TestClass {
	public TestClass() {
		System.out.println("constructor Called...");
	}
	protected void finalize() {
		System.out.println("Finalizer called...");
	}
	public static void main(String[] args) {
		TestClass obj=new TestClass();
		System.out.println("Address of Object : "+obj.hashCode());
		obj=null;
		System.gc();
	}

}
