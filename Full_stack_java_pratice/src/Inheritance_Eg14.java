class TestA{
    public void start(){
        System.out.println("parent class test method");
    }
}
public class Inheritance_Eg14 extends TestA {
    @Override
    public void start() {   // overridden method
        System.out.println("child class test method");
    }

    public static void main(String[] args) {
        ((TestA)new Inheritance_Eg14()).start();
        // here runtime object is Inheritance_Eg14 class , only the reference is parent type
        // for overridden methods call will happen based on runtime object.

    }
}
