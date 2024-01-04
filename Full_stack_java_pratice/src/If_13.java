public class If_13 {
    public static void main(String[] args) {
        Boolean b1 = true;   // Wrapper class , jvm b1 = true
        boolean b2  = false; // primitive , jvm b2 = false
        boolean b3 = true;  // primitive  , jvm b3 = true

      /*   ( ( true & false  -> false ) | ( false & true -> false ) & true )
           ( ( false ) | ( false ) & ( true )
           ( (false) & (true)
                  false         so if block is not executed     */
        if (( b1 & b2 )|( b2 & b3 ) & b3 )
            System.out.println("alpha");

        /*  ( b1 is re-assigned to false  | ( false & true -> false ) | ( false | false -> false )
            ( false | false | false )
             ( false | false )
              false    so if block is not executed           */

        if ( b1 = false | ( b1 & b3 ) | ( b1 | b2 ))
            System.out.println("beta");
    }
}
