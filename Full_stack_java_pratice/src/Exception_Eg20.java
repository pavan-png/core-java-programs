
class Base_1 {
    public void m1() throws NullPointerException {
        // unchecked exception
        System.out.println("Base: m1()");

    }

}

class Derived_1 extends Base_1 {
    public void m1() throws RuntimeException {
        // unchecked exception : whenever unchecked exception compiler will never check for
        // overriding rules for exception
        System.out.println("Derived: m1()");

    }

}

public class  Exception_Eg20{
    public static void main(String[] args) {
        Base_1 obj = new Derived_1();
        // based on runtime object call to method is made by jvm
        obj.m1();

    }

}
