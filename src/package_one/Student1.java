package package_one;
import package_two.Teacher;
public class Student1 extends Teacher{ //different package -protected -use extends 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student1 s=new Student1();
        System.out.println(s.maths);
	}

}
