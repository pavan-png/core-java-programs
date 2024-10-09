import java.util.ArrayList;

class Test_6{
    public void m1(ArrayList<String> al){
        al.add("hello");
        al.add("pavan");
        al.add("kalyan");
        al.add(null);
        System.out.println(al);
    }
}
public class Generic_Method_With_Wild_Card_Pattern {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
         /*
        if the type parameter is not specified then there will be no compile time error. if it is specified
         then it should be of same type of the parameter ( String ).
         */
        Test_6 obj = new Test_6();
        obj.m1(al);

    }
}
