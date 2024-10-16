interface M_Reference{
    public abstract void m1();
}
public class Method_Reference_Using_Instance_Method {
    public void test(){
        System.out.println("test method form class Method_Reference_Using_Instance_Method  ");
    }
    public static void main(String[] args) {
        M_Reference m = new  Method_Reference_Using_Instance_Method()::test;
        m.m1();

    }
}
