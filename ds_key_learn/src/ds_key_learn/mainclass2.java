package ds_key_learn;

/*public class mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         final int a=10;  // final variable  
         System.out.println(a);
	}

}*/

/*class A{
	final void disp() {
		System.out.println("class A");
	}
}
class B extends A{
	//final method can't override
}
public class mainclass2 {

	public static void main(String[] args) {
		B obj =new B();
		obj.disp();
	}
}*/
final class A{
     void disp() {
		System.out.println("class A");
	}
}
//final class can't inherit
public class mainclass2 {

	public static void main(String[] args) {
		A obj =new A();
		obj.disp();
	}
}