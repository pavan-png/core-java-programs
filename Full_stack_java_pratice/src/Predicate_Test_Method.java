import java.util.function.Predicate;

public class Predicate_Test_Method {
    public static void main(String[] args) {
        // anonymous inner class using interface

        Predicate ps = new Predicate() {
            @Override
            public boolean test(Object o) {
                Integer i = (Integer) o;
                if (i>10){
                    return true;
                }
                else {
                    return false;
                }
            }

        };
        System.out.println(ps.test(25));
    }
}
