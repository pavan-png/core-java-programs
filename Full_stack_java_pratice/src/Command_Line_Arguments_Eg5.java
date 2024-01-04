public class Command_Line_Arguments_Eg5 {
    public static void main(String[] args) {
        if(args.length==1 | args[2].equals("test")){
            System.out.println("test case");
        }
        else {
            System.out.println("something "+args[0]);
        }
    }
}

// java hello     command line argument