class Parent_992{
    public  static void display(){
        System.out.println("hello parent");
    }
}
class Child_992 extends  Parent_992{
    public static  void display(){
        System.out.println("hello child");
    }
}


public class Method_Hiding {
    public static void main(String[] args) {

            Parent_992 obj = new Child_992();
            obj.display();

            Parent_992 obj1 = new Parent_992();
            obj1.display();


    }
}
