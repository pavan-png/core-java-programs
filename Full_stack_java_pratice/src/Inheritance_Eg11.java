// Child class
class Sub_1 extends Inheritance_Eg11 {

    // This is a STATIC variable
    // It does NOT override the parent variable
    // It HIDES the parent variable with the same name
    public static final String Foo = "bar";
}

// Parent class
public class Inheritance_Eg11 {

    // Parent's static variable
    public static final String Foo = "foo";

    public static void main(String[] args) {

        // Creating parent class object
        Inheritance_Eg11 obj = new Inheritance_Eg11();

        // Creating child class object
        Sub_1 obj1 = new Sub_1();

        // ---------------- STATIC ACCESS ----------------

        // Best practice:
        // Static variables should be accessed using CLASS NAME

        // Accesses Foo defined in Inheritance_Eg11
        System.out.println(Inheritance_Eg11.Foo); // foo

        // Accesses Foo defined in Sub_1
        System.out.println(Sub_1.Foo); // bar

        // ---------------- OBJECT ACCESS ----------------
        // IMPORTANT:
        // Even if accessed using an object,
        // STATIC variables are resolved at COMPILE TIME
        // based on the REFERENCE TYPE, not the OBJECT TYPE

        // obj reference type = Inheritance_Eg11
        // So parent class Foo is used
        System.out.println(obj.Foo); // foo

        // obj1 reference type = Sub_1
        // So child class Foo is used
        System.out.println(obj1.Foo); // bar

        // ---------------- CASTING CASE ----------------

        // obj1 object is Sub_1
        // Casted reference type becomes Inheritance_Eg11
        // Static binding happens using reference type
        // So parent class Foo is used
        System.out.println(((Inheritance_Eg11) obj1).Foo); // foo
    }
}
