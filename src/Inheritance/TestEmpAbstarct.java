//package Inheritance;
//public class TestEmpAbstarct {
//	public static void main(String[] args) {
//		Employee emp=new Office(9001,"Vamshi",21500);
//		emp.calculateSal();
//		System.out.println("Details of Office Employee");
//		emp.show();
//		emp=new Factory(5001,"Vamsi",23456.75);
//		System.out.println("Details of Factory Employee");
//		emp.show();
//	}
//}
//abstract class Employee{
//	int eid;
//	String ename;
//	Double basicsal;
//	public Employee(int id,String name,double sal) {
//		eid=id;
//		ename=name;
//		basicsal=sal;
//	}
//	public void show() {
//		System.out.println("Emp ID : "+eid);
//		System.out.println("Emp Name : "+ename);
//		System.out.println("Basic Sal : "+basicsal);
//	}
//	public abstract void calculateSal();
//}
//class Office extends Employee{
//	double hra,da,pf,gs,ns;
//	public Office(int eid,String name,double sal) {
//		super(eid,name,sal);
//	}
//	public void calculateSal() {
//		hra=basicsal*25/100;
//		da=basicsal*20/100;
//		pf=basicsal*12.5/100;
//		gs=basicsal+hra+da;
//		ns=gs-pf;
//	}
//	public void showEmp() {
//		super.show();
//		System.out.println("HRA = "+hra);
//		System.out.println("DA = "+da);
//		System.out.println("PF = "+pf);
//		System.out.println("Gross Sal = "+gs);
//		System.out.println("Net Sal = "+ns);
//	}
//}
//	class Factory extends Employee{
//		double fa,sa,ma,pf,gs,ns;
//		public Factory(int eid,String name,double sal) {
//			super(eid,name,sal);
//		}
//		public void calculateSal() {
//			fa=basicsal*20/100;
//			sa=basicsal*15/100;
//			ma=basicsal*10/100;
//			pf=basicsal*12/100;
//			gs=basicsal+fa+sa+ma;
//			ns=gs-pf;
//		}
//		public void showEmp() {
//			super.show();
//			System.out.println("FA = "+fa);
//			System.out.println("MA = "+ma);
//			System.out.println("SA = "+sa);
//			System.out.println("PF = "+pf);
//			System.out.println("GS = "+gs);
//			System.out.println("NS = "+ns);
//	}
//}