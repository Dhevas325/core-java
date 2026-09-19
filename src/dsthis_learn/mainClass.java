package dsthis_learn;
/*class Laptop{
	String name="hp";
}
class Bike{
	int price=10;
}
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Laptop L1 =new Laptop();
        System.out.println(L1.name);
        Bike l2=new Bike();
        
        System.out.println(l2.price);
	}

}*/
class dad{
	int money=2000;//inheritance
}
class son extends dad{
	
}
public class mainClass {

	public static void main(String[] args) {
		son s1=new son();
		System.out.println(s1.money);
		
	}
}