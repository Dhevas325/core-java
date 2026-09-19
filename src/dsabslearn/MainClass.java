package dsabslearn;
abstract class Vehicle{
	abstract void speed();
	void brand() {
		System.out.println("XYZ");
	}
}
class Bike extends Vehicle{
	void speed() {
		System.out.println("35 km/hr");
	}
}
class Scooty extends Vehicle{
	void speed() {
		System.out.println("40km/hr");
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
        b.brand();
        b.speed();
        Scooty s = new Scooty();
        s.brand();
        s.speed();

	}

}
