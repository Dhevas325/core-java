package dsabslearn;
abstract class animal{
	abstract  void makeSound();
}
class Dog extends animal{
	void makeSound() {
		System.out.println("dog make");
	}
}
class Cat extends animal{
	void makeSound() {
		System.out.println("cat sound");
	}
}
public class aabskd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog d=new Dog();
        d.makeSound();
        Cat c=new Cat();
        c.makeSound();
	}

}
