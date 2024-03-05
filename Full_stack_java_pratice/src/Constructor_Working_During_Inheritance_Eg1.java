class parent{
    parent(){
        System.out.println("Hello this is parent class constructor");
    }
}
class Child extends parent{
    Child(){
        System.out.println("this is child class constructor ");
    }
}
public class Constructor_Working_During_Inheritance_Eg1{
    public static void main(String[] args) {


        Child ref = new Child();

    }
}
