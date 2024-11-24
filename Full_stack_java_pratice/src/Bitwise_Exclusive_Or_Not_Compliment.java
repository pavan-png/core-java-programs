public class Bitwise_Exclusive_Or_Not_Compliment {
    public static void main(String[] args) {
        boolean b1  = true;
        boolean b2  = false;

        /* !true -> false
           false ^ false -> false  */
        System.out.println( !false ^ false );

        /*  ( !true -> false & ( b2 is re-assigned to true )
             false & true -> false                            */
        System.out.println(" " +( !b1 & (b2 = true)));

        /*  true ^ false -> true   */
        System.out.println(" " + (b1 ^ b2));

        System.out.println(~-25);
    }
}
