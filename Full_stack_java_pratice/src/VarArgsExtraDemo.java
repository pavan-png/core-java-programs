public class VarArgsExtraDemo {

    // -------------------------------------------------
    // Method with int var-args
    // -------------------------------------------------
    public static void methodOne(int... x) {

        System.out.println("Number of elements: " + (x == null ? "null" : x.length));

        // Safe check to avoid NullPointerException
        if (x != null && x.length > 0) {
            System.out.println("First element: " + x[0]);
        }

        System.out.println("-----------------------");
    }

    // -------------------------------------------------
    // Method with Object var-args
    // -------------------------------------------------
    public static void methodTwo(Object... x) {

        System.out.println("Number of elements: " + x.length);

        for (Object obj : x) {
            System.out.println(obj);
        }

        System.out.println("-----------------------");
    }


    // -------------------------------------------------
    // Main Method
    // -------------------------------------------------
    public static void main(String[] args) {

        System.out.println("1️⃣ Calling in different ways");

        // No argument
        methodOne();

        // Single argument
        methodOne(10);

        // Multiple arguments
        methodOne(10, 20, 30);

        // Passing array directly
        methodOne(new int[]{1, 2, 3});


        System.out.println("2️⃣ Null Argument Case");

        // Passing null
        methodOne(null);

        /*
           Internally:
           int... x becomes int[] x
           So this is treated as:
           int[] x = null;

           If we try:
           System.out.println(x.length);
           It throws NullPointerException
        */


        System.out.println("3️⃣ Var-Args with Object Type");

        // Mixed types allowed
        methodTwo(10, "hello", 10.5, true);

        /*
           10      -> Autoboxed to Integer
           "hello" -> String
           10.5    -> Autoboxed to Double
           true    -> Autoboxed to Boolean

           All are objects, so allowed
        */
    }
}