package threadsex1;
/*class A extends Thread{
	public void run(){
		System.out.println("hello");
	}
}
class B extends Thread{
	public void run() {
		System.out.println("okay bye");
	}
}
public class exercise1 {
	public static void main(String[] args) {
    A a1=new A();
    B b1=new B();
    a1.start();
    b1.start();
}
}*/

/*class A extends Thread{
	public void run(){
	 for(int i=0;i<50;i++) {
		System.out.println("hello");
	 }
	}
}
class B extends Thread{
	public void run() {
	 for(int i=0;i<20;i++) {
		System.out.println("okay bye");
	 }
	}
}
public class exercise1 {
	public static void main(String[] args) {
      A a1=new A();
      B b1=new B();
      a1.start();
      b1.start();
}
}*/
/*class A extends Thread{
	public void run(){
	 for(int i=0;i<50;i++) {
		System.out.println("hello");
		try {
			Thread.sleep(10);//using thread
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	}
}
class B extends Thread{
	public void run() {
	 for(int i=0;i<20;i++) {
		System.out.println("okay bye");
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	}
}
public class exercise1 {
	public static void main(String[] args) {
      A a1=new A();
      B b1=new B();
      a1.start();
      b1.start();
}
}*/

// set priority
class A extends Thread{
	public void run(){
	 for(int i=0;i<50;i++) {
		System.out.println("hello");
		try {
			Thread.sleep(10);//using thread
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	}
}
class B extends Thread{
	public void run() {
	 for(int i=0;i<50;i++) {
		System.out.println("okay bye");
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	}
}
public class exercise1 {
	public static void main(String[] args) {
      A a1=new A();
      B b1=new B();
      b1.setPriority(10);
      a1.setPriority(2);
      a1.start();
      b1.start();
}
}

