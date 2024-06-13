class Parent_00{
    Parent_00(){
        System.out.println("this is  parent class constructor");
        System.out.println(this.hashCode()); // gives object address

    }
}
class Child_1 extends Parent_00{
Child_1(){
    System.out.println("this is child class constructor");
    System.out.println(this.hashCode());
}
}


public class Objects_Created_During_Child_Class_Object_Creation {
    public static void main(String[] args) {
        Child_1 obj = new Child_1();
        System.out.println(obj.hashCode());
    }
}
