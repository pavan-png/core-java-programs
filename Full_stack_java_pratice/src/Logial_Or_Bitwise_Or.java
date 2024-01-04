public class Logial_Or_Bitwise_Or {


    public static void main(String[] args) {
        int a =10 , b= 15,c  =20;

        // System.out.println(a<b||b>a);
        //  System.out.println(a<b|b>a);

        // Since the first condition is true(a<b) it will not check for second condition  so b = 15 (checks for true)
        System.out.println(a<b||b++>a);
        System.out.println(b);

        // 1st condition is true (a<b) it will check for 2nd condition.
        System.out.println(a<b|b++>a);
        System.out.println(b);
    }}
