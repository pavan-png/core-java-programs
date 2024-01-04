 class A {
    private int a = 10;
    private void p_Method()
    {
        System.out.println("this is a private method");

    }
}
public class Private_Acess_Modifier{
    public static void main(String[] args) {
        A obj = new A();
        // will not work since private
        //obj.p_Method();
        // will not work since private
        // System.out.println(a);
    }

}

