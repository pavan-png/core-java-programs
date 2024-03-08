class Order{
    // static variables
    static int a ;
    static int b ;

    // static block
     static {
    a = 10;
    b = 20;
        System.out.println("static block");
        System.out.println("static variables");
        System.out.println(a);
        System.out.println(b);
        System.out.println("----------------------------------------------------------------------------");
    }

    // static method
    static void static_Method(){
        System.out.println("static method");
        System.out.println("static variables");
        System.out.println(a);
        System.out.println(b);
        System.out.println("----------------------------------------------------------------------------");
    }

    //non static variables  ( instance variables )
    int c ;
    int d ;

    // java block
    {
        c = 30;
        d = 40;
        System.out.println("java block");
        System.out.println("static variables");
        System.out.println(a);
        System.out.println(b);
        System.out.println("non static variables");
        System.out.println(c);
        System.out.println(d);
        System.out.println("--------------------------------------------------------------------------------");
    }
        public Order(){
            System.out.println("constructor");
            System.out.println("static variables ");
            System.out.println(a);
            System.out.println(b);
            System.out.println("non static variables");
            System.out.println(c);
            System.out.println(d);
            System.out.println("---------------------------------------------------------------------------");
        }


    // non static method
    void non_Static_Method(){
        System.out.println("non static method");
        System.out.println("static variables");
        System.out.println(a);
        System.out.println(b);
        System.out.println("non static variables");
        System.out.println(c);
        System.out.println(d);
    }


}
public class Order_Of_Execution {
    public static void main(String[] args) {
        Order.static_Method();
Order obj = new Order();
obj.non_Static_Method();

    }
}
