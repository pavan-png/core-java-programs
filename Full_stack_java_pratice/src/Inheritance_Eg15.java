class Aplha1{
    public void foo(){
        System.out.println("method a");
    }
}
public class Inheritance_Eg15 extends Aplha1{
    public void foo(){ // overridden method
        System.out.println("method b");
    }
    public static void main(String[] args) {
        Aplha1 obj = new Inheritance_Eg15();
        Inheritance_Eg15 obj1 = (Inheritance_Eg15)obj;
        /*
        overridden methods are called based on runtime objects by jvm.
        here we are just type casting the reference , but the runtime object remains same.
         */
        obj.foo();
        obj1.foo();
    }
}
