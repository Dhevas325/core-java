package coding_super;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    int employeeId;

    Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class example {
    public static void main(String[] args) {
        Employee e1 = new Employee("Dheva", 211);

        e1.displayDetails();
    }
}