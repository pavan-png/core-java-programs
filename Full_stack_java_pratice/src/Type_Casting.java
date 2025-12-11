public class Type_Casting {
    public static void main(String... args) {

        /*
         * 127 + 21 = 148
         * 148 is OUTSIDE byte range (-128 to 127)
         *
         * JVM applies two's complement overflow formula
         * finalValue = MIN_range + (value - MAX_range - 1)
         */
        byte a = (byte) (127 + 21);
        System.out.println(a);   // overflow result
    }
}
