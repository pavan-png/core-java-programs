public class Unary_Operator_eg2 {
    public static void main(String[] args) {
        int a = 10;
        int b = -10;
        boolean c = true;
        boolean d = false;
        // -11 (minus of total positive value which starts from 0)
        System.out.println(~a);
        // //9 (positive of total minus, positive starts from 0)
        System.out.println(~b);

        System.out.println(!c);
        System.out.println(!d);

    }
}
