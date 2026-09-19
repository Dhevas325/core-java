public class garden {
    int apple_price=20;
    int apple_count=5;
    void total_money(){
        int total=apple_price*apple_count;
        System.out.println("Total money: " + total);
    }
    public static void main(String[] args){
        garden obj=new garden();
        obj.total_money();
    }
}
