package join_methods;
class A extends Thread{
    int j=0;
	public void run() {
		for(int i=0;i<50;i++) {
			j=i;
		}
	}
}
public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a1=new A();
        a1.start();
        try {
			a1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(a1.j);
	}

}
