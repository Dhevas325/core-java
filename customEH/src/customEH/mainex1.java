package customEH;
import java.util.Scanner;
/*class NotValidException extends Exception{
	
}
public class mainex1 { //custom exception handling

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        try {
        	int age=sc.nextInt();
        	if(age <18) {
        		throw new NotValidException();
        	}
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        
	}

}*/

/*class NotValidException extends Exception{
	
}
public class mainex1 { //custom exception handling

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        try {
        	int age=sc.nextInt();
        	if(age <18) {
        		throw new NotValidException();
        	}
        }
        catch (NotValidException e) {
        	System.out.println(e);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        
	}

}*/


class NotValidException extends Exception{
	public NotValidException(String S) {
		super(S);   //constructor
	}
}
public class mainex1 { //custom exception handling

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        try {
        	int age=sc.nextInt();
        	if(age <18) {
        		throw new NotValidException("your age should be 18");
        	}
        }
        catch (NotValidException e) {
        	System.out.println(e);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        
	}

}

