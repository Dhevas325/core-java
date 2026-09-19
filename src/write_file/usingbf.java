package write_file;
import java.io.FileWriter;
import java.io.BufferedWriter;
/*public class usingbf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        FileWriter fw=new FileWriter("output1.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("dg happy");
        bw.newLine();
        bw.write("ok");
        bw.close();
        System.out.println("success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}*/
public class usingbf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        FileWriter fw=new FileWriter("output1.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        
        bw.newLine();
        bw.append("vadapalani");
        bw.close();
        System.out.println("success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
