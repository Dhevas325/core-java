public class pro{
    String getname(){ 
        return "Dhevasundhari";
    }
    int getnumber(){
        return 1234567890;
    }
        public static void main(String[] args){
           pro obj=new pro();
           String str1=obj.getname();
           int num=obj.getnumber();
           System.out.println(str1);
           System.out.println(num);
    }
}
