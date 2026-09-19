public class example1 {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        example1 s=new example1();
        s.sum(10, 20);
        s.sum(10, 20, 30);
    }
}
