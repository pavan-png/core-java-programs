interface Test_1{
    String s = "Hello";
}
public class IVariable implements Test_1 {
    public static void main(String[] args) {
       // s = "hi" ; compile time error
        System.out.println(s);
    }
}
