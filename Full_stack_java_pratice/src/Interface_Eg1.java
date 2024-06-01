interface ISample{
    // methods are public and abstract by default
    void m1();
    void m2();
}
class SampleImpl implements  ISample{
    @Override
    public void m1() {
        System.out.println("Hello this is method m1");
    }

    @Override
    public void m2() {
        System.out.println("Hello this iss method m2");
    }
}



public class Interface_Eg1 {
    public static void main(String[] args) {
        ISample obj = new SampleImpl();  // Loose coupling
        obj.m1();
        obj.m2();
    }
}
