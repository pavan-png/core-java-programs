@FunctionalInterface
interface Subtract{
    public int  sub(int a);
}
public class Functional_Interface_With_Single_Parameter_SingleLine_Body {
    public static void main(String[] args) {
        // since only one parameter () are omitted , and body consists of only one line so { } are omitted
        // if body is written in single statement then return should be omitted.
        Subtract obj = a -> a = a-1 ;
        System.out.println(obj.sub(5));

    }
}
