package OOPs;
public class AnimalChaining {
	public static void main(String[] args) {
		Mammal m=new Mammal();
	}
}
class Animal{
//	constructor
	Animal(){
		System.out.println("class Animal Constructor");
	}
}
class Mammal extends Animal{
//	constructor
	Mammal(){
		System.out.println("class Mammal constructor");
	}
}