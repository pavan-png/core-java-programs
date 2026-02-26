import java.io.IOException;
import java.io.FileNotFoundException;

/*
 Step 1:
 Interface method declares a checked exception (IOException).

 Rule:
 When implementing an interface method that throws a checked exception,
 the implementing class must follow overriding rules:

 ✔ Can throw same exception
 ✔ Can throw subclass (narrower)
 ✔ Can throw nothing
 ❌ Cannot throw broader checked exception
*/

interface C0 {

    void m1() throws IOException;
}

class c11 implements C0 {

    // ✔ Valid
    // Interface declares IOException (checked)
    // Implementing method throws nothing (narrower behavior)
    // This is allowed.

    public void m1() {
    }
}
class c12 implements C0 {

    // ✔ Valid
    // FileNotFoundException is a subclass of IOException.
    // Narrower checked exception is allowed.

    public void m1() throws FileNotFoundException {
    }
}
class c13 implements C0 {

    // ✔ Valid
    // Same checked exception as declared in interface.

    public void m1() throws IOException {
    }
}
/*
class Exception_Eg21 implements C0 {

    // ❌ Compile-time error
    // Exception is broader than IOException.
    // Child (implementing class) cannot widen the checked exception.

    public void m1() throws Exception {}
}
*/