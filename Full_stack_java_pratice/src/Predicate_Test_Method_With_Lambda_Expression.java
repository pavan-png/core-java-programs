import java.util.function.Predicate;

public class Predicate_Test_Method_With_Lambda_Expression {
    public static void main(String[] args) {
        Predicate ps = (Object o)->{
            Integer i = (Integer) o;
            if (i>10){
                return true;
            }
            else {
                return false;
            }
        };
        System.out.println(ps.test(25));
    }
}
