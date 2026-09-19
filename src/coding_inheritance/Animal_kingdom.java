package coding_inheritance;

class Animal{
	String name;
	int age;
	void makeSound() {
		System.out.println("Animal makes Sound");
	}
	
}
class Dog extends Animal{
	String breed;
	@Override
	void makeSound(){
		System.out.println("Dog Barks");
		
	}
	void fetch() {
		System.out.println("Dog is fetching");
	}
}
class cat extends Animal{
	String color;
	@Override
	void makeSound(){
		System.out.println("Cat meows");
	}
	void climb() {
		System.out.println("Cat is climbing");
	}
}
public class Animal_kingdom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog a1=new Dog();
        //a1.name="lion";
        //a1.age=5;
        a1.makeSound();
        a1.name="XYZ";
        a1.age=5;
        a1.breed="Golden";
        a1.fetch();
        cat c1 =new cat();
        c1.name="pinky";
        c1.age=6;
        c1.color="Brown";
        c1.makeSound();
        c1.climb();
        
	}

}
