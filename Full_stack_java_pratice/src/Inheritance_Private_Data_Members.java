class A111{
    private String name = "pavan";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class A112 extends A111{
    public void disp(){
        setName("pavan");
        System.out.println(getName());
    }
}
public class Inheritance_Private_Data_Members {
    public static void main(String[] args) {
        A112 obj = new A112();
        obj.disp();
    }
}
