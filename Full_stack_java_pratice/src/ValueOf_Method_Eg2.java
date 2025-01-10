public class ValueOf_Method_Eg2 {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("1111");
        System.out.println(i1);
        Integer i2 = Integer.valueOf("11111",4);
        /*
        1
        1*4 every time multiplied by 4 since radix is 4.
        4*4
        16*4
        64*4
        total 1+4+16+64+256 = 341
         */

        System.out.println(i2);
        Integer i4 = Integer.valueOf("11",36);
        System.out.println(i4);
        Integer i5 = Integer.valueOf("0",35);
        System.out.println(i5);
        Integer i3 = Integer.valueOf("ten");
        System.out.println(i3);
        // if exception occurs execution will terminate without executing further code.

        Integer i6 = Integer.valueOf("10",5);
        System.out.println(i6);



    }
}
