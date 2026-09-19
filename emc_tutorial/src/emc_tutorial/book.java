package emc_tutorial;

public class book {
	book(){ //constructor overloading
		System.out.println("Empty");
	}
    book(int a){
    	System.out.println(a);
    	System.out.println("hello");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book ob1=new book(10);
		book ob2=new book();

	}

}
