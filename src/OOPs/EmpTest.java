package OOPs;
public class EmpTest {
	public static void main(String[] args) {
		Emp e1=new Emp(123,"Vamshi Vade",2500.25);
		System.out.println("Emp Details");
		System.out.println("Emp ID : "+e1.getEid());
		System.out.println("Emp Name : "+e1.getName());
		System.out.println("Emp Salary : "+e1.getSal());
	}
}
class Emp{
	int eid;
	String name;
	double sal;
	public Emp(int eid,String name,double sal) {
		this.eid=eid;
		this.name=name;
		this.sal=sal;
	}
	public int getEid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public double getSal() {
		return sal;
	}
}