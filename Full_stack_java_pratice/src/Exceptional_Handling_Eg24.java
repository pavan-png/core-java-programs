public class Exceptional_Handling_Eg24 {
    public static void main(String[] args) {
        try {
            // main method accepts string array , whatever is there in args we are calling below , so no compile time error
            main(args);  // infinite call to same main method StackOverFlow error - ( child of Error )
        }
        catch (Exception e){
            System.out.println("catch - ");
        }
        System.out.println("out");
    }
}
