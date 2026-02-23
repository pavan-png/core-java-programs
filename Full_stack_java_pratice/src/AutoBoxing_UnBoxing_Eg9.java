public class AutoBoxing_UnBoxing_Eg9 {

    // Instance variable of wrapper type.
    // Since it is NOT initialized,
    // default value = null.
    Integer i;

    // Primitive instance variable.
    // Default value = 0.
    int x;

    public AutoBoxing_UnBoxing_Eg9(int y){

        /*
         Expression: x = i + y;

         Here:
         i → Integer (wrapper, currently null)
         y → int (primitive)

         Java cannot directly add Integer + int.
         So first AUTO-UNBOXING happens.

         Internally this becomes:

             x = i.intValue() + y;

         But i is null.

         So this becomes:

             x = null.intValue() + y;

         Calling any method on null → NullPointerException.
        */

        x = i + y;   // 💥 NullPointerException occurs here

        // This line will NEVER execute.
        System.out.println(x);
    }

    public static void main(String[] args) {

        // Here constructor expects int.
        // We are passing new Integer(4).
        // So AUTO-UNBOXING happens:
        //
        // new Integer(4) → 4
        //
        // That part is safe.
        new AutoBoxing_UnBoxing_Eg9(new Integer(4));
    }
}