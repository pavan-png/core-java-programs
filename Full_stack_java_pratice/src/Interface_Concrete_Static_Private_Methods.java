// Interface with default, static and private methods
interface Sample {

    // ✅ DEFAULT METHOD
    // - Has body
    // - Participates in inheritance
    // - Can be overridden in implementation class
    default void disp() {
        System.out.println("this is display-1 method of sample interface");
    }

    // ✅ Another DEFAULT METHOD
    // - Automatically inherited by implementing class
    default void disp_1() {
        System.out.println("this is display-2 method of sample interface");
    }

    // ✅ STATIC METHOD (Java 8 feature)
    // - Does NOT participate in inheritance
    // - Cannot be overridden
    // - Must be called using InterfaceName.method()
    static void disp_2() {
        System.out.println("this is static method of interface");

        // ✅ Private static method can be called inside static method
        disp_4();
    }

    // ❌ PRIVATE METHOD (Java 9 feature)
    // - Used only inside interface
    // - Does NOT participate in inheritance
    // - Cannot be accessed in implementation class
    private void disp_3() {
        System.out.println("this is private method of interface");
    }

    // ✅ STATIC METHOD
    // - Same rule: must be called using interface name
    static void hello() {
        System.out.println("static method hello of interface");
    }

    // ❌ PRIVATE STATIC METHOD
    // - Only usable inside interface
    // - Cannot be accessed in implementation class
    private static void disp_4() {
        System.out.println("this is private static method of interface");
    }
}


// Implementation class
class Impl_Class implements Sample {

    // Custom method to test all possible method usages
    public void testAllMethods() {

        System.out.println("Inside Impl_Class");

        // ✅ Calling inherited default method
        // (Because default methods participate in inheritance)
        disp_1();

        // ✅ Calling overridden method
        disp();

        // ✅ Calling static method
        // IMPORTANT:
        // Static methods are NOT inherited.
        // So we must call using InterfaceName.methodName()
        Sample.disp_2();

        Sample.hello();

        // ❌ Not Allowed:
        // Private methods are not visible here
        // disp_3();  // Compile-time error

        // ❌ Not Allowed:
        // Private static methods are not visible
        // disp_4();  // Compile-time error
    }

    // ✅ Overriding default method
    // Rule:
    // Overriding method must be public
    @Override
    public void disp() {

        System.out.println("display method of implementation class");

        // ✅ If you still want to call interface default version,
        // use InterfaceName.super.method()
        Sample.super.disp();
    }
}


// Main class
public class Interface_Concrete_Static_Private_Methods {

    public static void main(String[] args) {

        // Reference type is interface
        Sample obj = new Impl_Class();

        // ✅ Calls overridden method (runtime polymorphism)
        obj.disp();

        // ✅ Calls inherited default method
        obj.disp_1();

        // ❌ Cannot call static method using object
        // obj.disp_2();  // Compile-time error

        // ✅ Correct way to call static method
        Sample.disp_2();
    }
}
