public class Math {
    void add(int a, int b) {
        System.out.println(a + b);
    }
    void sub(int a, int b) {
        System.out.println(a - b);
    }
    void mul(int a, int b) {
        System.out.println(a * b);
    }
    void div(int a, int b) {
        if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Error: Division by zero");
        }
    }
    public static void main(String[] args) {
        Math obj = new Math();
        obj.add(10, 20);
        obj.sub(10, 20);
        obj.mul(10, 20);
        obj.div(10, 20);
    }
}
