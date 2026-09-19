package write_file;
import java.io.FileWriter;
/*public class ioexerice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        FileWriter fw=new FileWriter("output.txt");
        fw.write("dhevag happy");
        fw.close();
        System.out.println("success");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
 

}*/


/*public class ioexerice1 {
 //override in txt
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        FileWriter fw=new FileWriter("output.txt");
        fw.append("gokul");
        fw.close();
        System.out.println("success");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
 

}*/
public class ioexerice1 {
//file append

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//true add panna already write panni irukkurathoda add aagum
        FileWriter fw=new FileWriter("output.txt",true);
        fw.append("dhevag happy");
        fw.close();
        System.out.println("success");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
 

}

