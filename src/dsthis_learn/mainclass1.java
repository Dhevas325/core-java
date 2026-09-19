package dsthis_learn;
// Type of inheritance


/*class Animal{
	void eat(){
		System.out.println("This animal can eat");
	}
}
class Dog extends Animal{// single inheritance
	void bark() {
		System.out.println("barks");
	}
}

public class mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.bark();
		d1.eat();

	}

}*/
/*class A{
	int one=1;
}
class B extends A{ // multilevel inheritance
	int two =2;
}
class C extends B{
	int three=3;
}
public class mainclass1 {

	public static void main(String[] args) {
		C ob1=new C();
		System.out.println(ob1.three);
		System.out.println(ob1.two);
		System.out.println(ob1.one);
	}
}*/

/*class Animal{
	void eat(){
		System.out.println("This animal can eat");
	}
}
class Dog extends Animal{//ex2 multilevel inheritance
	void bark() {
		System.out.println("barks");
	}
}

class puppy extends Dog{
	void weep() {
		System.out.println("weep");
	}
}
public class mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puppy ob3=new puppy();
        ob3.bark();
		
		Dog ob2=new Dog();
		ob2.eat();
      	}

}*/





/*
class Animal{
	void eat(){
		System.out.println("This animal can eat");
	}
}
class Dog extends Animal{// Hierarichial inheritance
	void bark() {
		System.out.println("barks");
	}
}
class cat extends Animal{
	void meow() {
		System.out.println("cat can meow");
	}
}

public class mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat ob1=new cat();
		ob1.eat();
		Dog ob2=new Dog();
		ob2.eat();

	}

}*/



class Animal{
	void eat(){
		System.out.println("This animal can eat");
	}
}
class Dog extends Animal{// Hybrid inheritance
	void bark() {
		System.out.println("barks");
	}
}
class cat extends Animal{
	void meow() {
		System.out.println("cat can meow");
	}
}
class puppy extends Dog{
	void weep() {
		System.out.println("weep");
	}
}
public class mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puppy ob3=new puppy();
        ob3.bark();
		cat ob1=new cat();
		ob1.eat();
		Dog ob2=new Dog();
		ob2.eat();
      	}

}
