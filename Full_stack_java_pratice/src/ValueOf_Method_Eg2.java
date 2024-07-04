public class ValueOf_Method_Eg2 {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("1111");
        System.out.println(i1);
        Integer i2 = Integer.valueOf("1111",2);
        System.out.println(i2);
        Integer i4 = Integer.valueOf("1111",36);
        System.out.println(i4);
        Integer i5 = Integer.valueOf("0",35);
        System.out.println(i5);
        Integer i3 = Integer.valueOf("ten");
        System.out.println(i3);
        // if exception occurs execution will terminate without executing further code.


    }
}
