package dsifacelearn;
/*interface A{// functional interface
	void disp();
}
public class lamexpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A obj=new A() {
        	public void disp() {
        		System.out.println("hello");
        	}
        };
        obj.disp();
	}

}*/

// lambda expression
interface A{// functional interface
	void disp();
}// lambda expression
public class lamexpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A obj=() ->{
        	System.out.println("hello");
        	
        };
        obj.disp();
	}

}