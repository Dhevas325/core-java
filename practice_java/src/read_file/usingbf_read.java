package read_file;
import java.io.FileReader;
import java.io.BufferedReader;
/*public class usingbf_read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {// one line 
        	FileReader fr=new FileReader("output1.txt");
        	BufferedReader br=new BufferedReader(fr);
        	String line=br.readLine();
            System.out.println(line);
            br.close();
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}*/
/*public class usingbf_read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try { //line by line without while 
        	FileReader fr=new FileReader("output1.txt");
        	BufferedReader br=new BufferedReader(fr);
        	String line=br.readLine();
            System.out.println(line);
            line=br.readLine();
            System.out.println(line);
            line=br.readLine();
            System.out.println(line);
            br.close();
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}*/

public class usingbf_read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	FileReader fr=new FileReader("output1.txt");
        	BufferedReader br=new BufferedReader(fr);
        	String line=br.readLine();//using while loop line by line
        	while(line!=null) {
              System.out.println(line);
              line=br.readLine();
        	}
        	br.close();
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}