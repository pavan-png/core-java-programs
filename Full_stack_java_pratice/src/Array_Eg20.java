public class Array_Eg20 {
    int[] a ;
    public static void main(String[] args) {
        int b[];
        /* if array is declared locally without declaring the size, and if we try to access it, it leads to
         compile time error. if it is declared at class level if and we try to print we will get default value
         null.

         */
       // System.out.println(b);

        Array_Eg20 obj = new Array_Eg20();
        System.out.println(obj.a);
        System.out.println(obj.a[0]);


    }
}
