class Outer_1{
    private static String a  = "hello";
   static void hello(){
        System.out.println("static method of outer class");
    }
    static class Inner{
        void msg(){
            System.out.println(a);
            hello();
        }
    }
}
public class Static_Nested_Class_With_Instance_Method {
    public static void main(String[] args) {
        Outer_1.Inner obj1 = new Outer_1.Inner();
        obj1.msg();

    }
}
