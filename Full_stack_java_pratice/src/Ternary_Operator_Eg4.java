public class Ternary_Operator_Eg4 {
    public static void main(String[] args) {
        Integer i = 42;

        /* Here the  compiler is  checking int variables , and the result is of type string ,
         so it can be stored in the string data type , no compilation error   */
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        System.out.println(s);
    }
}
