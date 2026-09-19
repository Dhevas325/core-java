package dsifacelearn;
interface Animal{
	int mark=20;//can't change the value.public,static,final
	void sound();
}
class cat implements Animal{
	@Override
	public
	void sound() {
		System.out.println(" meow");
	}
	//in java8 new method creation-using default
	/*default void disp() {
		System.out.println("car");
	}*/
}
public class mainclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        cat c=new cat();
        System.out.println(c.mark);
	}

}
