class Test_14 {
    static void method() {
        System.out.println("this is static method");
    }
}

public class Static_Method_1 {
    public static void main(String[] args) {

        Test_14.method();        // correct and recommended

        Test_14 ref = new Test_14();
        ref.method();         // allowed, but not recommended
    }
}
