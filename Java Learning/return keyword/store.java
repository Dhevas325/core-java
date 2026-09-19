
public class store {
    int add(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args){
        store obj=new store();
        int addition=obj.add(10,20);
        System.out.println(addition);
    }
    
}
