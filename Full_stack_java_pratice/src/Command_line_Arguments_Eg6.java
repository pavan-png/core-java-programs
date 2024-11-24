public class Command_line_Arguments_Eg6 {
    public static void main(String[] args) {
        // local variable
        int x ;
        if (args.length>0){
            int y =10;
            x =10;
        }
        /*
        static and instance variables can be used without intilizaton . as default values are assigned to it.
        x is a local variable it should be intialized before it is used.
         C.E since x is intialized in the block , there is  no gaurantee  that block would be executed by compiler


        System.out.println(x);

         */
    }
}
