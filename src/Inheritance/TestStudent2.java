package Inheritance;
public class TestStudent2 {
	public static void main(String[] args) {
		Marks s1=new Marks(123,"Vamshi",90,91,92);
		System.out.println("Student Details");
		s1.show();
	}
}
class Student{
	int rollno;
	String name;
	public Student(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}
	public void show() {
		System.out.println("Roll no : "+rollno);
		System.out.println("Student name : "+name);
	}
}
class Marks extends Student{
	int m1,m2,m3;
	public Marks(int rollno,String name,int m1,int m2,int m3) {
		super(rollno,name);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void show() {
		super.show();
		int total=m1+m2+m3;
		double avg=total/3;
		System.out.println("Marks 1 : "+m1);
		System.out.println("Marks 2 : "+m2);
		System.out.println("Marks 3 : "+m3);
		System.out.println("total : "+total);
		System.out.println("avg : "+avg);
	}
}