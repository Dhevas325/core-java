package dsifacelearn;
interface Readable{
	void read();
}
interface Writable{
	void write();
}
interface storable{
	void store();
}
class file implements Readable,Writable,storable{
	public void read() {
		System.out.println("read");
	}
	public void write() {
		System.out.println("write");
	}
	public void store() {
		System.out.println("store");
	}
}
public class cmichal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        file f1=new file();
        f1.read();
        f1.write();
        f1.store();
	}

}
