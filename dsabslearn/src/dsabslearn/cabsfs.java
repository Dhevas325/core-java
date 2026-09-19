package dsabslearn;


abstract class Vehi{

    abstract void drive();

    final void startEngine() {
        System.out.println("Engine started");
    }

    static String getVehicleType() {
        return "petrol";
    }
}

class Car extends Vehi {

    @Override
    void drive() {
        System.out.println("Car is driving");
    }
}

class Motorcycle extends Vehi {

    @Override
    void drive() {
        System.out.println("Motorcycle is driving");
    }
}

public class cabsfs {
	public static void main(String[] args) {

        Car c = new Car();

        c.startEngine();                    // final method
        c.drive();                          // overridden method
        System.out.println(Vehi.getVehicleType()); // static method

        Motorcycle m = new Motorcycle();

        m.startEngine();                    // final method
        m.drive();                          // overridden method
        System.out.println(Vehi.getVehicleType()); // static method
    }
}
