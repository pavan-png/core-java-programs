import java.util.function.Predicate;

class MyPredicate implements Predicate<Object>{
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
}
public class Predicate_Test_Method_Without_Lambda_Expression {
    public static void main(String[] args) {
        MyPredicate obj = new MyPredicate();
        System.out.println(obj.test(6));
    }
}
