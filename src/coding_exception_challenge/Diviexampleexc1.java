package coding_exception_challenge;
import java.util.Scanner;
class DivisionExample{
	void dividenumbers( int numerator, int denominator) {
		try {
			int result=numerator/denominator;
			System.out.println(result);
	    }
		catch (ArithmeticException e) {
				System.out.println("Cannot divide by zero");
		}
	}
}
public class Diviexampleexc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1 =sc.nextInt();
		int n2=sc.nextInt();
        DivisionExample de1=new DivisionExample();
        
        de1.dividenumbers(n1, n2);
	}

}
