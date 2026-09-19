package read_file;
import java.io.FileReader;
/*public class ioread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        FileReader fr=new FileReader("output1.txt");
        int c=fr.read(); //read char (letter)
        System.out.println((char)c);
        fr.close();
		}
		catch (Exception e) {
			System.out.println("something happened");
		}
	}

}*/
public class ioread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        FileReader fr=new FileReader("output1.txt");
        int c=fr.read(); //read 
          while (c!=-1) {
             System.out.print((char)c);
             c=fr.read();
		  }
          fr.close();
		}
		catch (Exception e) {
			System.out.println("something happened");
		}
	}

}

