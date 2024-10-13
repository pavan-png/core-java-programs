public class Exceptional_Handling_Eg30 {
    static Double d1; // null
    int i = d1.intValue();
    /* instance variables get life only when object is  created, here object is not created so
    there is no problem of NullPointerException
     */

    public static void main(String[] args) {
        System.out.println("Hello");

    }
}
