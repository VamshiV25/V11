package Inheritance;
public class TestStudent1 {
	public static void main(String[] args) {
		Mark s1=new Mark(123,"Vamshi",90,91,92);
		System.out.println("Student Details");
		s1.getStudent();
		s1.getMarks();
	}
}
class Students{
	int rollno;
	String name;
	public Students(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public void getStudent(){
		System.out.println("Roll no : "+rollno);
		System.out.println("Student Name : "+name);
	}
}
class Mark extends Students{
	int m1,m2,m3;
	public Mark(int rollno,String name,int m1,int m2,int m3) {
		super(rollno,name);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void getMarks() {
		int total=m1+m2+m3;
		double avg=total/3;
		System.out.println("Marks 1 : "+m1);
		System.out.println("Marks 2 : "+m2);
		System.out.println("Marks 3 : "+m3);
		System.out.println("Total : "+total);
		System.out.println("Avg : "+avg);
	}
}