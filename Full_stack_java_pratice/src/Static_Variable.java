public class Static_Variable {
    static  String name = "pavan";
    static String address ;
    static int ph_No = 123;
    static  boolean n ;

    public static void main(String[] args) {

        // we cannot declare static variables in main methodc

        System.out.println(Static_Variable.name);
        System.out.println(Static_Variable.address);
        System.out.println(ph_No);
        System.out.println(n);
    }
}
