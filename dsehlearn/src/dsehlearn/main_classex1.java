package dsehlearn;
import java.util.Scanner;
import java.util.InputMismatchException;
public class main_classex1 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		try {
			int a=sc.nextInt();
	        int b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
	   }
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException: Please enter integers only.");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException: Cannot divide by zero.");
		}
		System.out.println("program ended");
		
		sc.close();
	}	
	
}

