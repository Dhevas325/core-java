package emc_tutorial;

public class book1 {
	int marks;
	String name;
	book1(int a,String b){
		marks=a;
		name=b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        book1 b=new book1(32,"Dheva");
        System.out.println(b.marks);
	}

}
