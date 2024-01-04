public class Logical_And_Bitwise_And {
    public static void main(String[] args) {
        int a = 4,b= 6,c = 4;
      //  System.out.println(a<b&&b>a);
        // System.out.println(a<b&b>a);

        //  since 1st condition(a>b) is false it does not check for other so a is 4 (checks for false)
        System.out.println(a>b && a++>c);
        System.out.println(a);

        //    1st condition is false it will check for other so a is 5
        System.out.println(a>b & a++>c);
        System.out.println(a);
    }
}