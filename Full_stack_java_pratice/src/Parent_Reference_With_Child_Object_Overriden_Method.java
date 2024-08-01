class Parent_991{
    public  void display(){
        System.out.println("hello parent");
    }
}
class Child_991 extends  Parent_991{
    public  void display(){
        System.out.println("hello child");
    }
}

public class Parent_Reference_With_Child_Object_Overriden_Method {
    public static void main(String[] args) {
        Parent_991 obj = new Child_991();
        obj.display();

        // here the output will be the hello child , means we can override in the child class.
    }
}
