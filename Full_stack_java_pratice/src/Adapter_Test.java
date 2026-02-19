// ================= OLD STYLE (Before Java 8) =================
interface ITest_Old {
    void m1();
    void m2();
    void m3();
    void m4();
    void m5();
}

// Adapter class (should be abstract)
abstract class AdapterImpl implements ITest_Old {

    public void m1() {}
    public void m2() {}
    public void m3() {}
    public void m4() {}
    public void m5() {}
}

// We only need m3()
class TestAdapter_Old extends AdapterImpl {

    @Override
    public void m3() {
        System.out.println("OLD: Only m3 is required");
    }
}


// ================= NEW STYLE (Java 8 Default Methods) =================
interface ITest_New {

    default void m1() {}
    default void m2() {}
    default void m3() {}
    default void m4() {}
    default void m5() {}
}

// No Adapter class needed
class TestAdapter_New implements ITest_New {

    @Override
    public void m3() {
        System.out.println("NEW: Only m3 is required");
    }
}


public class Adapter_Test {

    public static void main(String[] args) {

        // Old approach
        ITest_Old oldObj = new TestAdapter_Old();
        oldObj.m3();

        // New approach
        ITest_New newObj = new TestAdapter_New();
        newObj.m3();
    }
}
