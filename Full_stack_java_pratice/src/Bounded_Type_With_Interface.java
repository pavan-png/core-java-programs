class Test_4 <T extends Runnable>{
    // go through the Runnable Hirearchy

}
public class Bounded_Type_With_Interface {
    public static void main(String[] args) {
        Test_4 <Thread> t = new Test_4<Thread>();
    }
}
