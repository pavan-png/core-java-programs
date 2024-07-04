public class AutoBoxing_Unboxing_Eg3 {
    static  Integer i1 ; // default value of the object is null
    public static void main(String[] args) {
        int i2 = i1; // int i2 = i1.intvalue() // on null you cant do any operation. null pointer exception
        System.out.println(i2);
    }
}
