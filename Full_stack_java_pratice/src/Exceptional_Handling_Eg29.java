public class Exceptional_Handling_Eg29 {

    static Double d1;  // null
    // default value for all the wrapper classes is null
    static int i = d1.intValue(); // on null if we are trying to perform operation it leads to NullPointerException

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
