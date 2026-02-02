class demo11{
    String name  = "pavan";
    int age = 24;

    void disp(){
        System.out.println("Iam " + name + " age is " + age);
    }
}

class demo12 extends demo11{
}
class demo13 extends demo11{
}
class demo14 extends demo11{
}

public class Hierarchical_Inheritance_Eg3{
    public static void main(String[] args) {
        demo14 obj  = new demo14();
        obj.disp();
    }
}
