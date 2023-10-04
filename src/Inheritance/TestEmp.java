//package Inheritance;
//public class TestEmp {
//	public static void main(String[] args) {
//		Office e1=new Office(123,"Vamshi",25000.25);
//		Factory e2=new Factory(456,"Vani",30000.25);
//		
//		e1.calculateSal();
//		System.out.println("Office Employee Details");
//		e1.showEmp();
//		
//		e2.calculateSal();
//		System.out.println("\nFactory Employee Details");
//		e2.showEmp();
//	}
//}
//class Employee{
//	int eid;
//	String ename;
//	double sal;
//	public Employee(int id,String name,double sal) {
//		this.eid=id;
//		this.ename=name;
//		this.sal=sal;
//	}
//	public void showEmp() {
//		System.out.println("ID : "+eid+"\nName : "+ename+"\nSal : "+sal);
//	}
//}
//class Office extends Employee{
//	double hra,da,pf,gs,ns;
//	public Office(int id,String name,double sal) {
//		super(id,name,sal);
//	}
//	public void calculateSal() {
//		hra=sal*25/100;
//		da=sal*20/100;
//		pf=sal*12.5/100;
//		gs=sal+hra+da;
//		ns=gs-pf;
//	}
//	public void showEmp() {
//		super.showEmp();
//		System.out.println("HRA:"+hra+"\nDA:"+da+"\nPF:"+pf+"\nGS:"+gs+"\nNS:"+ns);
//	}
//}
//class Factory extends Employee{
//	double fa,sa,ma,pf,gs,ns;
//	public Factory(int id,String name,double sal) {
//		super(id,name,sal);
//	}
//	public void calculateSal() {
//		fa=sal*20/100;
//		sa=sal*15/100;
//		ma=sal*10/100;
//		pf=sal*12/100;
//		gs=sal+fa+sa+ma;
//		ns=gs-pf;
//	}
//	public void showEmp() {
//		super.showEmp();
//		System.out.println("FA:"+fa+"\nSA:"+sa+"\nMA:"+ma+"\nPF:"+pf+"\nGS:"+gs+"\nNS:"+ns);
//	}
//}