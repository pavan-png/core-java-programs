
interface A5{
   // by default the variables in the interface are public static final , so value should be given while declaration
    String s = "hello";

    // from jdk 1.8 interface can have concrete methods only if the modifier is default , private
    default void method1(){
        System.out.println("pavan");
    }
}
interface B2{

}

// an interface can extend two interfaces at a time , multiple inheritance is possible through interface
interface C extends A5 , B2{

    // we can override method with same signature , only one method will be copied.
    default void method1(){
        System.out.println("hello");
    }

    /* interface method cannot be given protected modifier it leads to compile time error
        overloaded method
     */

     public void method1(int x);
}

public class Interface_Eg6 {
    public static void main(String[] args) {
        // no compilation error

    }
}
