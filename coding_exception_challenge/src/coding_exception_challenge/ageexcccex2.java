package coding_exception_challenge;
import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg ){
		super(msg); // my version
	}
}
class AgeValidator{
	void checkAge(int age) {
		try {
		  if(age<0 || age >150) {
			throw new InvalidAgeException("Age should be greater than or equal 1");
		   }
		  else {
			  System.out.println("valid age");
		  }
		}
		catch (InvalidAgeException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class ageexcccex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        AgeValidator a1=new AgeValidator();
        a1.checkAge(a);
	}
}
/*
package coding_exception_challenge;

import java.util.Scanner;  //ai version

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

public class ageexcccex2 {

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
}*/