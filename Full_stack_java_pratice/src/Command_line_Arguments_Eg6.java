public class Command_line_Arguments_Eg6 {
    public static void main(String[] args) {
        int x ;
        if (args.length>0){
            int y =10;
            x =10;
        }
        // C.E since x is intialized in the block , there is  no gaurantee  that block would be executed by compiler
        // System.out.println(x);
    }
}
