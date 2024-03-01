public class Static_Methods {
    static void method()
    {
        System.out.println("this is a static method");

    }

    public static void main(String[] args)
    {
        Static_Methods.method();
        method();
        Static_Methods ref = new Static_Methods();
        ref.method();
    }

}
