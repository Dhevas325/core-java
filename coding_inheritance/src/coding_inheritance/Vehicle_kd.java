package coding_inheritance;
class vehicle{
	String brand;
	int year;
	void startEngine() {
		System.out.println("car Engine");
	}
}
class car extends vehicle{
	String fuelType;
	@Override
	void startEngine() {
		System.out.println("Car engine starts");
	}
	void drive() {
		System.out.println("Car is driving");
	}
}
class Truck extends vehicle{
	int loadCapacity;
	@Override
	void startEngine() {
		System.out.println("Truck engine starts");
	}
	void haul() {
		System.out.println("Truck is hauling");
	}
}
public class Vehicle_kd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1=new car();
		c1.brand="mahindra";
		c1.year=6;
		c1.fuelType="petrol";
		System.out.println(c1.fuelType);
		c1.startEngine();
		c1.drive();
		
		Truck t1=new Truck();
		t1.brand="LCV";
		t1.year=4;
		t1.loadCapacity=5;
		t1.startEngine();
		t1.haul();

	}

}
