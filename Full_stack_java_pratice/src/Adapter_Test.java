interface ITest{
    void m1();
    void m2();
    void m3();
    void m4();
    void m5();
}

class AdapterImpl implements ITest{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m5() {

    }
}
class Test_Adapter extends AdapterImpl{
    @Override
    public void m3() {
        System.out.println("this is m3 method ");
    }
}

public class Adapter_Test {

    public static void main(String[] args) {
        ITest obj = new Test_Adapter();
        obj.m3();
    }
}
