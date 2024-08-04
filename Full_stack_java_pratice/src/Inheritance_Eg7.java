class Foo_1{
    public int a = 3 ;//instance variable
public void add_Five(){
    a += 5;
    System.out.println("f");
}
}
public class Inheritance_Eg7 extends Foo_1 {
public  int a = 8; // instance variable   there is no concept of variable overriding.
    public void add_Five(){
       this.a += 5;
        System.out.println("b ");
    }
    public static void main(String[] args) {
        Foo_1 obj = new Inheritance_Eg7(); // loose coupling
        obj.add_Five(); // call will be decided by jvm because it is overriding method . and jvm execute method based on runtime object i.e Inheritance_Eg7
        System.out.println(obj.a);
        // since aa is present in both parent and child compiler only wil bind based on reference type .
        // here reference type is Foo_1

    }
}
