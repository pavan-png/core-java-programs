public class Switch_Eg13 {
    public static void main(String[] args) {

        boolean opt = true;

        /*
         The below switch block is commented because it causes a COMPILE-TIME ERROR.

         Reason:
         -------
         Java does NOT allow `boolean` data type in switch expressions.

         Java switch supports only:
         ---------------------------
         - byte
         - short
         - char
         - int
         - enum
         - String (from Java 7)

         boolean is NOT supported.

         Therefore:
         switch (true) ❌ invalid
         case true     ❌ invalid
         case false    ❌ invalid

         This code will not compile.
        */

        /*
        switch (true) {
            case true:
                System.out.println("True");
            case false:
                System.out.println("false");
        }
        */
    }
}
