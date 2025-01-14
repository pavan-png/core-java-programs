public class AutoBoxing_UnBoxing_Eg6 {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = 10; // internally    Integer i2 = Integer.valueOf(10)
        /*
        here another object will created for i2, and since i1 and i2 are not pointing to the same object
        it returns false.
        s.c.p is only for String class.

         */
        System.out.println(i1==i2);
    }
}
