public class Wrapper_Class_Parse_Method_RealTime_Usage {
    public static void main(String[] args) {
        // before applying parse method all the data given by the user is treated as String only.
        System.out.println("before applying parse method : ");
        System.out.println(args[0]+args[1]);

        System.out.println("After applying parse method :");
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        System.out.println( i1 + i2);

        // here jvm first finds string data  and all the remaining data that is added is treated as string.
        System.out.println( "after parse method "+i1 + i2);

    }
}
