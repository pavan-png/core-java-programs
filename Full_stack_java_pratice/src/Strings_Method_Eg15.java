public class Strings_Method_Eg15 {
    public static void main(String[] args) {
        String s = new String("pavan");
        System.out.println(s.charAt(2));

         System.out.println(s.charAt(-1));
         // array index out of bounds exception negative indexing is not allowed in java

        System.out.println(s.charAt(500));
        // index range below and above the array is not allowed leads to array index out of bounds exception.

        //   System.out.println(s[2]);   compile time error .

    }
}
