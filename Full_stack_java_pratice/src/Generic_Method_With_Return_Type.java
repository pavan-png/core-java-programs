class Test_10{
    public <T extends Number> void m1(T t){

    }
}
public class Generic_Method_With_Return_Type {
    public static void main(String[] args) {
        Test_10 t =new Test_10();
        t.m1(10);
        // if we provide the argument other than the hierarchy of number type it leads to compile  time error
    }
}
