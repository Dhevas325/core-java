package runnable_thread;
class A implements Runnable{
	public void run(){
		System.out.println("hey hello");
	}
}
public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Runnable obj=new A();
        Thread t1=new Thread(obj);
        t1.start();
	}

}
