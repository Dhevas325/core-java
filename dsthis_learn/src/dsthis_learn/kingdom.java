package dsthis_learn;

/*class  dheva{
	dheva(){
		System.out.println("animal");
	}
}
class gokul extends dheva{
	gokul(){
		System.out.println("Dogs");
	}
}
public class kingdom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         gokul d1= new gokul();
	}
}*/

/*class  dheva{
	dheva(){
		System.out.println("animal");
	}
}
class gokul extends dheva{
	gokul(){
		super();   // super key
		System.out.println("Dogs");
	}
}
public class kingdom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         gokul d1= new gokul();
	}
}*/
/*class  dheva{
	dheva(String name){
		System.out.println(name);
	}
}
class gokul extends dheva{
	gokul(){
		super("monkey");
		System.out.println("Dogs");
	}
}
public class kingdom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         gokul d1= new gokul();
	}
}*/

/*class  dheva{
	dheva(String name){
		System.out.println(name);
	}
	void makeSound() {
		System.out.println("Animal makes sound");
	}
}
class gokul extends dheva{
	gokul(){
		super("monkey");
		super.makeSound();
		System.out.println("Dogs");
	}
}
public class kingdom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         gokul d1= new gokul();
	}
}*/
class  dheva{
	int age=12;
	dheva(String name){
		System.out.println(name);
	}
	void makeSound() {
		System.out.println("Animal makes sound");
	}
}
class gokul extends dheva{
	gokul(){
		super("monkey");
		super.makeSound();
		System.out.println("Dogs");
		System.out.println(super.age);
	}
}
public class kingdom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         gokul d1= new gokul();
	}
}