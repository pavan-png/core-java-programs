public class Increment_Eg_3 {
    final public static void main(String[] args) {
        int a =20;
        int value  = --a * a++ +a-- - --a;
        System.out.println("a = " +a);
        System.out.println("value = "+value );
    }
}
