import java.util.function.Function;

public class Function_Apply_Using_lambda {
    public static void main(String[] args) {
        Function<String,Integer > obj = (String s)->{
            return s.length();
        };
        int i = obj.apply("Hello");
        System.out.println(i);

    }
}
