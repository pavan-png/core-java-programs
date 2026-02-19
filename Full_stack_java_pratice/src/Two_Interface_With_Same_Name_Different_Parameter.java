interface IDemo {
    void a1();
}

interface JDemo {
    void a1(int i);
}

class IDemoImpl implements IDemo, JDemo {

    @Override
    public void a1() {
        System.out.println("Method with no parameters");
    }

    @Override
    public void a1(int i) {
        System.out.println("Method with parameter: " + i);
    }
}

public class Two_Interface_With_Same_Name_Different_Parameter {

    public static void main(String[] args) {

        IDemoImpl obj = new IDemoImpl();

        obj.a1();
        obj.a1(10);
    }
}
