import java.util.*;
public class School {
    String passorfail(int totalMark){
        if(totalMark>=35){
            return "pass";
        }else{
            return "fail";
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int totalMark=scan.nextInt();
        School s=new School();
        String result=s.passorfail(totalMark);
        System.out.println(result);


    }
}
