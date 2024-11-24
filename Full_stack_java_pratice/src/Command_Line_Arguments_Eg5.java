public class Command_Line_Arguments_Eg5 {
    public static void main(String[] args) {
        //bitwise or operator will check both the conditions even though the first one evaluates to true.
        if(args.length==1 | args[1].equals("test")){
            // if we try to access the location that we have not provided as command line arguments,
            // it leads to ArrayIndexOutOfBoundsException.
            System.out.println("test case");
        }
        else {
            System.out.println("something "+args[0]);
        }
    }
}

// java hello     command line argument