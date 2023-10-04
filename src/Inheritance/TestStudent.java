//package Inheritance;
////Driver Class
//public class TestStudent {
//	public static void main(String[] args) {
//		Marks s1=new Marks();
//		s1.setStudent(1234,"Vamshi");
//		s1.setMarks(70,80,90);
//		System.out.println("Student Details");
//		s1.getStudent();
//		s1.getMarks();
//	}
//}
////Base Class
//class Student{
//	int rollno;
//	String name;
//	public void setStudent(int rollno,String name) {
//		this.rollno=rollno;
//		this.name=name;
//	}
//	public void getStudent() {
//		System.out.println("Roll no : "+rollno);
//		System.out.println("Student name : "+name);
//	}
//}
////Derived Class
//class Marks extends Student{
//	int m1,m2,m3;
//	public void setMarks(int m1,int m2,int m3) {
//		this.m1=m1;
//		this.m2=m2;
//		this.m3=m3;
//	}
//	public void getMarks(){
//		int total=m1+m2+m3;
//		double avg=total/3;
//		System.out.println("Marks 1 : "+m1);
//		System.out.println("Marks 2 : "+m2);
//		System.out.println("Marks 3 : "+m3);
//		System.out.println("Total Marks : "+total);
//		System.out.println("Avg Marks : "+avg);
//	}
//}