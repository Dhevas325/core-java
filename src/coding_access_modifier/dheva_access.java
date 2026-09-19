package coding_access_modifier;

class Person{
	public String name;
	protected int age;
	private int socialSecurityNumber;
	String address;
	Person(String name,int age,int socialSecurityNumber,String address){
		this.name=name;
		this.age=age;
		this.socialSecurityNumber=socialSecurityNumber;
		this.address=address;
	}
	
}
class Employee extends Person{
	Employee(String name,int age,int socialSecurityNumber,String address){
        super(name,age,socialSecurityNumber,address);
	}
}

public class dheva_access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Dheva",21,2222,"Thanjavur");
		System.out.println(e1.name);
		System.out.println(e1.age);
		
		System.out.println(e1.address);
		
	}

}
