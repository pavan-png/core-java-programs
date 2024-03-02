public class Operator_Eg5 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = true;
        boolean flag4 = false;

        // evaluation happens from left to right
        System.out.println(!flag1== flag2 != flag3 == !flag4);

        // evaluation happens first on right side after that result is assigned to flag1
        System.out.println(flag1 = flag2 != flag3 == !flag4);

    }
}
