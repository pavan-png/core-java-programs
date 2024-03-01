class test{
    static void method(){
        System.out.println("this is static method");
    }
}
public class Static_Method_1 {
    public static void main(String[] args) {
        test.method();
        test ref = new test();
        ref.method();
    }

}
