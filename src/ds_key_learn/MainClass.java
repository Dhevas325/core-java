package ds_key_learn;
/*class Teacher{
	static int marks=0;
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=new Teacher();
        t1.marks=60;
        Teacher t2=new Teacher();
        t2.marks=50;
        System.out.println(t2.marks);
	}

}*/


/*class Teacher{
	int marks=0;
	static String name="Dheva";
}
public class MainClass {  //use class name

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=new Teacher();
        t1.marks=60;
        Teacher t2=new Teacher();
        t2.marks=50;
        Teacher.name="Gokul";
        System.out.println(Teacher.name);
	}

}*/
/*class Teacher{
	int marks=0;
	

    static void disp() {
	    System.out.println("hello");
     }
}
public class MainClass {  //use class name

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher.disp();
			}

}*/

/*
public class MainClass {  //use class name
    static int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println(a);
	}

}*/


public class MainClass {  //use class name
    static{ // static block
    	System.out.println("hey there");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("hello");
        MainClass m1=new MainClass();
        MainClass m2=new MainClass();
	}

}