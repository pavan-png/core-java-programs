public class Explicit_Typecasting {
    public static void main(String[] args) {
        byte a = 10;
        double b = 5;
        byte c = (byte) (a*b);
        System.out.println(c);
        c = (byte) (a/b);
        System.out.println(c);

    }
}
