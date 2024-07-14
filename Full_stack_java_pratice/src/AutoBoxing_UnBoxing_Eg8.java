public class AutoBoxing_UnBoxing_Eg8 {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        System.out.println(i1==i2); // creates 2 new objects on the heap

        Integer i3 = Integer.valueOf(11);
        Integer i4 = Integer.valueOf(11);
        System.out.println(i3==i4); // uses buffer of object

        Integer i5 = 12; // internally Integer.valueOf(12) is called by compiler
        Integer i6 = 12;
        System.out.println(i5==i6); // uses buffer of objects

        Integer i7 = 13;
        Integer i8 = Integer.valueOf(13);
        System.out.println(i7==i8); // uses buffer of objects.
    }
}
