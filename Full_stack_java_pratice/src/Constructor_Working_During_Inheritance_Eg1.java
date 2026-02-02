class Parent{
    Parent(){
        System.out.println("Hello this is parent class constructor");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("this is child class constructor ");
    }
}
public class Constructor_Working_During_Inheritance_Eg1{
    public static void main(String[] args) {


        Parent obj = new Parent();


    }
}
