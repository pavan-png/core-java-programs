class One {
    public One foo() {
        System.out.println("One.foo()");
        // 'this' refers to the current object at runtime
        // It is returned as type One
        return this;
    }
}

class Two extends One {
    @Override
    public One foo() {
        System.out.println("Two.foo()");
        // 'this' is actually a Two or Three object at runtime
        // It is returned as type One
        return this;
    }
}

class Three extends Two {
    @Override
    public Two foo() {
        System.out.println("Three.foo()");
        // 'this' refers to the current object, which is Three
        // The method promises to return Two
        // So Java upcasts the Three object to Two
        return this; // returns object of class Three ( covariant-return type)
        /*
        Covariant return type means:
        an overriding method can return a child type of the parent method’s return type.
         */
    }
}

public class Inheritance_Eg13 {

    public static void main(String[] args) {

        // CASE 1: Parent reference, parent object
        One o1 = new One();
        o1.foo();
        // OUTPUT: One.foo()

        System.out.println("--------------");

        // CASE 2: Parent reference, child object
        One o2 = new Two();
        o2.foo();
        // OUTPUT: Two.foo()
        // Method execution depends on the actual object (Two)

        System.out.println("--------------");

        // CASE 3: Parent reference, grandchild object
        One o3 = new Three();
        o3.foo();
        // OUTPUT: Three.foo()
        // Method execution depends on the actual object (Three)

        System.out.println("--------------");

        // CASE 4: Child reference, grandchild object
        Two t1 = new Three();

        // t1.foo() executes Three.foo() at runtime
        // 'this' inside foo() is the Three object
        // It is returned as Two (method return type)
        // That same object is safely stored in One reference
        One result = t1.foo();
        // OUTPUT: Three.foo()

        System.out.println("Returned object class = " + result.getClass().getName());
        // OUTPUT: Returned object class = Three

        System.out.println("--------------");

        // CASE 5: Calling again using returned reference
        result.foo();
        // OUTPUT: Three.foo()
        // Even though reference is One,
        // the actual object is still Three
    }
}
