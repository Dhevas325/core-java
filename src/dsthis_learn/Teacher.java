package dsthis_learn;

public class Teacher {
	String myName;
	Teacher(){
		System.out.println("Hi");
	}
	void setName(String myName) {
		this.myName=myName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=new Teacher();
		t1.setName("marks");
		System.out.println(t1.myName);
		

	}

}
