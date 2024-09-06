interface Base{
    default void foo(){
        System.out.println("this is base class method");
    }
     default void foo_1(){
        System.out.println("this is base class method");
    }
}
interface Derived extends Base{

    // base interface concrete-methods can be overridden in the child interface
    default void foo(){
        System.out.println("this is derived class method ");
    }
}
interface Another_Interface{
    public static void foo(){
        System.out.println("this is another interface method ");
    }
}
public class Interface_Eg4 implements Derived , Another_Interface{
    /*
    static methods will never be inherited to implementation class from interface

     */
    public static void main(String[] args) {
        Interface_Eg4 obj = new Interface_Eg4();
        obj.foo();

    }
}
