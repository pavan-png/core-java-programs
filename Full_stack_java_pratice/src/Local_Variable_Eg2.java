public class Local_Variable_Eg2 {
    public static void main(String[] args) {
        try {
            int i =  Integer.parseInt("ten");
        }
        catch (NullPointerException e){
            // System.out.println(i); C.E
            // since i is in try block it cannot be accessed in the catch block
        }
    }
}
