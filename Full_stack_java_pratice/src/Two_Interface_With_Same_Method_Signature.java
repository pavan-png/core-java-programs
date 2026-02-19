interface ISample_01 {
    void m1();
}

interface ISample_02 {
    void m1();
}

class SmplImpl implements ISample_01, ISample_02 {

    @Override
    public void m1() {
        System.out.println("Single implementation for both interfaces");
    }
}

public class Two_Interface_With_Same_Method_Signature {

    public static void main(String[] args) {

        SmplImpl obj = new SmplImpl();
        obj.m1();

        ISample_01 ref1 = obj;
        ref1.m1();   // Polymorphic call

        ISample_02 ref2 = obj;
        ref2.m1();   // Same implementation used
    }
}
