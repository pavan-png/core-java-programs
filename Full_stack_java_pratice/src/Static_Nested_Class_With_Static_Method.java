class Outer_2{
 private static String a = "Hello there";
static class Inner_2{
    public static void msg(){
        System.out.println(a);
    }
}
}
public class Static_Nested_Class_With_Static_Method {
    public static void main(String[] args) {
        // since static method and class  no need to create object , it is  called with class
        Outer_2.Inner_2.msg();

        // static method and class can also be called in this way.
        Outer_2.Inner_2 obj1 = new Outer_2.Inner_2();
        obj1.msg();
    }
}
