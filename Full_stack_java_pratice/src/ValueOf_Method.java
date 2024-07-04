public class ValueOf_Method {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        System.out.println(i1);

        Integer i2 = Integer.valueOf("10");
        System.out.println(i2);

        Boolean b1 = Boolean.valueOf("pavan");
        System.out.println(b1);
        
        Integer i3 = Integer.valueOf("ten");
        System.out.println(i3); // NumberFormatException


    }
}
