import java.util.Scanner;
public class addition {//with parameters
    void add(int a,int b){
        int c=a+b;
        System.out.println("The sum is:"+c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        addition obj=new addition();
        obj.add(a,b);
    }
}
