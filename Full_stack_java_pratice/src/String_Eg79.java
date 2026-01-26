public class String_Eg79 /* extends String */ {

    // The String class in Java is declared as FINAL.
    // Because of this, it CANNOT be inherited by any other class.
    //
    // If you try to uncomment:
    //    extends String
    // the compiler will throw an error:
    //    "cannot inherit from final java.lang.String"
    //
    // Reason:
    // Making String final prevents modification of its behavior,
    // which is important for security, immutability, and performance.
    //
    // To verify that String is final:
    // Open command prompt and run:
    //    javap java.lang.String
    // You will see:
    //    public final class java.lang.String

    public static void main(String[] args) {

        // Declaring a String reference
        // No object is created here, value is null by default
        String name;
    }
}
