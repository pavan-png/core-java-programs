public class AutoBoxing_UnBoxing_Eg11 {
    public static void main(String[] args) {

        // Suppose command line arguments are:
        // java AutoBoxing_UnBoxing_Eg11 true null
        // args[0] = "true"
        // args[1] = "null"

        boolean a = new Boolean(Boolean.valueOf(args[0]));

        // boolean a = new Boolean(Boolean.valueOf("true"))
        // Boolean.valueOf("true")  => true
        // So boolean a = new Boolean(true)
        // Wrapper Boolean(true) assigned to primitive boolean
        // Auto-unboxing happens
        // So a = true

        System.out.println(a);


        boolean b = new Boolean(new Boolean(args[1]));

        // boolean b = new Boolean(new Boolean("null"))
        // new Boolean("null")  => false
        // (Because only "true" gives true, everything else is false)
        // So boolean b = new Boolean(false)
        // Wrapper Boolean(false) assigned to primitive boolean
        // Auto-unboxing happens
        // So b = false

        System.out.println(b);
    }
}