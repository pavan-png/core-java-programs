public class AutoBoxing_UnBoxing_Eg11 {
    public static void main(String[] args) {
        boolean a = new Boolean((Boolean.valueOf(args[0])));
         /*         command line arguments   1  null
         from command line arguments any  data given is taken as string
                   new Boolean(false // false is of wrapper type );
                      again converting it into wrapper class
                      and storing in the primitive type a.

          */
        System.out.println(a);
        // null is taken as string from command line arguments. so no pointer exception
        boolean b = new Boolean(new Boolean(args[1]));
        System.out.println(b);
    }
}
