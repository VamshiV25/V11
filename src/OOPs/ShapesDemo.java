package OOPs;
public class ShapesDemo {
	public static void main(String[] args) {
		Shapes s1=new Shapes();
		Shapes cube=new Shapes(15);
		Shapes box=new Shapes();
		System.out.println("Volume of Shape : "+s1.volume());
		System.out.println("Volume Cube : "+cube.volume());
		System.out.println("Vol of Box : "+box.volume());
	}
}
class Shapes{
	int length,breadth,height;
	public Shapes() {
		length=breadth=height=1;
	}
	public Shapes(int side) {
		length=breadth=height=side;
	}
	public Shapes(int l,int b,int h) {
		length=l;
		breadth=b;
		height=h;
	}
	public int volume() {
		return length*breadth*height;
	}
}