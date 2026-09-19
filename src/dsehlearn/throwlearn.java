package dsehlearn;
import java.util.Scanner;
/*public class throwlearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {
          int a=10;
          throw new Exception();
	    }
	    catch(Exception e) {
	    	System.out.println(e);
	    }
	    finally {
	        System.out.println("program ended");
	    }
	}

}*/

/*public class throwlearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {
          int a=10/0;
          throw new ArithmeticException();
	    }
	    catch(ArithmeticException e) {
	    	System.out.println(e);
	    }
	    finally {
	        System.out.println("program ended");
	    }
	}

}*/


/*public class throwlearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {
          int a=10/2;
          throw new ArithmeticException("hi finally");
	    }
	    catch(ArithmeticException e) {
	    	System.out.println(e);
	    }
	    finally {
	        System.out.println("program ended");
	    }
	}

}*/

public class throwlearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    try {
          int age=sc.nextInt();
          if(age<=1) {
              throw new ArithmeticException("age should be greater than 1");
          }
	    }
	    catch(ArithmeticException e) {
	    	System.out.println(e);
	    }
	  
	    finally {
	        System.out.println("program ended");
	    }
	}

}
