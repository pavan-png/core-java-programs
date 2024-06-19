public class Integer_Constructors {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        // 'Integer(int)' is deprecated since version 9 and marked for removal
        System.out.println(i1);
        Integer i2 = new Integer("10");
        //'Integer(java.lang.String)' is deprecated since version 9 and marked for removal
        System.out.println(i2);
        Integer i3 = Integer.valueOf(10);
        System.out.println(i3);
        Integer i4 = Integer.valueOf("10");
        System.out.println(i4);

        // Number format exception arises in both the cases
        Integer i5 = new Integer("Ten");
        System.out.println(i5);
        Integer i6 = Integer.valueOf("Ten");
        System.out.println(i6);
    }
}
