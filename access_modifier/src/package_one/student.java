package package_one;
/*class Teacher{
	public String name="Dheva";
}
public class student { public can access it anywhere

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Teacher t1=new Teacher();
         System.out.println(t1.name);
	}

}*/


/*class Teacher{
	private String name="Dheva";//output:Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	//The field Teacher.name is not visible
	//at access_modifier/package_one.student.main(student.java:24)//
}
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Teacher t1=new Teacher();
         System.out.println(t1.name);
	}

}*/

class Teacher{
	private String name="Dheva";
	void disp() {  // private modifer can access only in class
		System.out.println(name);
	}
}
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Teacher t1=new Teacher();
        t1.disp();
	}

}