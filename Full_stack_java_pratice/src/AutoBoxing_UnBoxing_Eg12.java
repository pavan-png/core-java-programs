public class AutoBoxing_UnBoxing_Eg12 {

    // Method 1: takes primitive int
    public static void doSum(int x ,int y){
        System.out.println("int sum is " + (x + y));
    }

    // Method 2: takes Integer wrapper
    public static void doSum(Integer x ,Integer y){
        // x + y causes AUTO-UNBOXING
        // internally: x.intValue() + y.intValue()
        System.out.println("Integer sum is " + (x + y));
    }

    // Method 3: takes primitive double
    public static void doSum(double x ,double y){
        System.out.println("double sum is " + (x + y));
    }

    // Method 4: takes primitive float
    public static void doSum(float x ,float y){
        System.out.println("float sum is " + (x + y));
    }

    public static void main(String[] args) {

        // 10 and 20 are int literals.
        // Exact match found: doSum(int,int)
        // JVM always prefers exact primitive match.
        doSum(10,20);

        /*
         10.00 and 20.00 are double literals by default.
         Exact match found: doSum(double,double)
         So double version is executed.
        */
        doSum(10.00,20.00);
    }
}