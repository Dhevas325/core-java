package dsthrowslearn;


import java.util.Scanner;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String msg) {
        super(msg);
    }
}

class AgeValidator {

    void checkAge(int age) throws InvalidAgeException {

        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age should be between 0 and 150");
        }

        System.out.println("Valid age");
    }
}

public class cexccthrowslearn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        AgeValidator a1 = new AgeValidator();

        try {
            a1.checkAge(a);
        }
        catch (InvalidAgeException e) {
            System.out.println(e);
        }

        sc.close();
    }
}
