class Outer_1{
    private static String a  = "hello";
    static class Inner{
        void msg(){
            System.out.println(a);
        }
    }
}
public class Static_Nested_Class_With_Instance_Method {
    public static void main(String[] args) {
        Outer_1 obj = new Outer_1();
        Outer_1.Inner obj1 = new Outer_1.Inner();
        obj1.msg();

    }
}
