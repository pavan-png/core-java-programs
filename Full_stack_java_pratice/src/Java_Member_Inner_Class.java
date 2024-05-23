class Outer{
    private String a = "Hello";
    class Inner{
        void print_Data(){
            System.out.println(a);
        }
    }
}


public class Java_Member_Inner_Class {
    public static void main(String[] args) {
        Outer obj = new Outer();

        // Inner (class)  is available in the outer (class) , so Outer.Inner
        // And since class Inner is non-static , non-static members are called using object . so obj.new Inner()
        Outer.Inner obj1 = obj.new Inner();
        obj1.print_Data();
    }
}
