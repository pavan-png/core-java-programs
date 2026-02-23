public class AutoBoxing_UnBoxing_Eg13 {

    public static void main(String[] args) {

        // Creating Boolean wrapper object explicitly
        // true (primitive) → converted to Boolean object
        Boolean obj = new Boolean(true);   // obj contains true

        // AutoBoxing happens here:
        // 343 is primitive int
        // It is automatically converted into Integer object
        Integer x = 343;

        // Creating object of current class and calling go() method
        // Parameters passed:
        // obj → Boolean object
        // x   → Integer object

        // Important:
        // Method expects (Boolean b, int i)
        // x is Integer → automatically UNBOXED to primitive int

        // Method returns primitive int
        // That int is automatically BOXED into Integer object
        Integer y = new AutoBoxing_UnBoxing_Eg13().go(obj, x);

        // Printing result
        System.out.println(y);
    }

    int go(Boolean b, int i) {

        // Here "b" is Boolean object
        // In if condition → it is automatically UNBOXED to primitive boolean
        if (b)  // AutoUnboxing happens here
            return (i / 7);  // 343 / 7 = 49

        // Only executed if b is false
        return (i / 49);
    }
}