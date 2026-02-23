public class AutoBoxing_Unboxing_Eg3 {

    // i1 is a reference variable of type Integer (wrapper class).
    // Since it is a static variable and not initialized,
    // default value for any object reference is NULL.
    static Integer i1;   // default value = null

    public static void main(String[] args) {

        // Here i1 is NULL.
        // But i2 is primitive int.
        // So Java tries to do AUTO-UNBOXING.
        // That means internally it tries:
        // int i2 = i1.intValue();
        //
        // But i1 is NULL.
        // Calling any method on NULL causes NullPointerException.
        int i2 = i1;   // autounboxing (Integer → int)

        // This line will NEVER execute
        // because program crashes at above line.
        System.out.println(i2);
    }
}