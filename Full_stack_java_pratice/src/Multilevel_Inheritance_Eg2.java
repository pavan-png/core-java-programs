class A11{
    String name  = "pavan";
    int age = 24;
    void disp(){
        System.out.println("Iam "+name + " age is "+ age);
    }
}
class A12 extends A11{

}
class A13 extends A12{

}
class A14 extends A13{

}
public class Multilevel_Inheritance_Eg2{
    public static void main(String[] args) {
        A13 obj = new A13();
        obj.disp();
    }
}
