package OOPs;
public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.sid=9001;
		s1.name="Vamshi";
		System.out.println("Student id : "+s1.sid);
		System.out.println("Student name : "+s1.name); 
	}
}
class Student{
	int sid;
	String name;
}