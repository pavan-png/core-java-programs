public class Local_Variable_Eg2 {
    public static void main(String[] args) {
        try {
            int i =  Integer.parseInt("10");
            System.out.println(i);
        }
        catch (NullPointerException e){
             e.printStackTrace();
            // here i is a local variable cannot be accessed in the catch block
        }
    }
}
