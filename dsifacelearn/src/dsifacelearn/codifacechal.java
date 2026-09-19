package dsifacelearn;
interface printable{
	void display();
}
interface showable{//multiple inheritance 
	void display();
}
class Document implements printable,showable{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("documents print");
	}
	
}
public class codifacechal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Document d=new Document();
        d.display();
	}

}
