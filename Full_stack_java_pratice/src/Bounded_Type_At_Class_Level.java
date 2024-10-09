class Test_3 <T extends Number> {
    // go through Number Hirearchy
}
public class Bounded_Type_At_Class_Level {
    public static void main(String[] args) {
        Test_3<Integer> i = new Test_3<Integer>();
        Test_3<Byte> b= new Test_3<Byte>();
        Test_3<Short> s = new Test_3<Short>();
        Test_3<Long> l = new Test_3<Long>();
      //  Test_3<String> q = new Test_3<String>();   C.E

    }
}
