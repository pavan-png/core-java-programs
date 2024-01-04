class Acess {
    protected void msg(){
        System.out.println("Overriding method");
    }
}
public class Acess_Modifiers_Overriding extends Acess {
    public static void main(String[] args) {

        /* default is more restrictive than protected
             void msg(){
            System.out.println("hello");
        } */
    Acess_Modifiers_Overriding obj = new Acess_Modifiers_Overriding();
    obj.msg();
    }
}
