interface ISample_1{
    void m1();
    void m2();
}
  abstract class Sample_1Impl implements ISample_1{
    @Override
    public void m1() {
        System.out.println("this is  method m1");
    }
}

/*
if Sub_Sample_Impl implements ISample interface then it need to override both m1() and m2() otherwise
 it should also be abstract.
if Sub_Sample_Impl extends from Sample_Impl then it needs to override only m2(). since m1 is already present
in parent Sample_1Impl it should override only m2().

*/
class Sub_Sample_Impl extends Sample_1Impl{
    @Override
    public void m2() {
        System.out.println("this is method m2");
    }
}
public class Interface_Eg2 {
    public static void main(String[] args) {

        ISample_1 obj = new Sub_Sample_Impl(); // Loose Coupling
        obj.m1();
        obj.m2();
    }

}
