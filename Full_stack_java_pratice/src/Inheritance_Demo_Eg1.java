 class Inherit{
    String name = "pavan";
    int age = 24;

    void disp(){
        System.out.println("name is "+name +" age is "+ age);
    }
}
class Inherit2 extends Inherit{

}
public class Inheritance_Demo_Eg1{
    public static void main(String[] args) {
        Inherit2 obj = new Inherit2();
        obj.disp();
    }
}
