import java.util.Scanner;

public class find {
    int evenorodd(int num){
        if(num%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        find obj=new find();
        int result=obj.evenorodd(num);
        if(result==1){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
