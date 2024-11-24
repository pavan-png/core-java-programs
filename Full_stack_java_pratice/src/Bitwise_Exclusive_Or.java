public class Bitwise_Exclusive_Or {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        if ((a++ > 4)  ^ (b++ > 6)){
            System.out.println(a);
            System.out.println(b);
        }
        else {
            System.out.println("hi");
        }
    }
}
