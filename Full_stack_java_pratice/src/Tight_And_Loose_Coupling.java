class Parent00{
    void disp(){
        System.out.println("parent is displaying");
    }
}
class Child01 extends Parent00{
    void disp(){
        System.out.println("Child01 is displaying");
    }
}
class Child11 extends Parent00{
    void disp(){
        System.out.println("Child11 is displaying ");
    }
}
public class Tight_And_Loose_Coupling {
    public static void main(String[] args) {

        Child01 obj = new Child01();
        obj.disp();
        Parent00 obj1 = new Child01();
        obj1.disp();
        Child11 obj2 = new Child11();
        obj2.disp();

        System.out.println("----------------------------------------------------------------------");
        Parent00 ref;
        ref = obj;
        ref.disp();
        ref = obj2;
        ref.disp();


    }
}
