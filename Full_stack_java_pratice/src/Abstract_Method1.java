 abstract  class Abstract_Method {
    abstract void airthmethic_Operation();
}
class Ar extends Abstract_Method{
    @Override
    void airthmethic_Operation() {
        int a = 10,b= 5;
        System.out.println("add "+ " " +( a + b));
    }
}
class Ar1 extends Abstract_Method{
    @Override
    void airthmethic_Operation() {
        int c= 10,d = 5;
        System.out.println("sub"+ " "+ (c-d));
    }
}
public class Abstract_Method1{
    public static void main(String[] args) {
        Abstract_Method obj  = new Ar();
        obj.airthmethic_Operation();
        Abstract_Method obj1 = new Ar1();
        obj1.airthmethic_Operation();


    }
}