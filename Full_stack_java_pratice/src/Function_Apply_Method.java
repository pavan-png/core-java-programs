import java.util.function.Function;

class MyFunction implements Function<String,Integer>{
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
public class Function_Apply_Method {
    public static void main(String[] args) {

        MyFunction obj = new MyFunction();
       Integer i =  obj.apply("Hello");
        System.out.println(i);


    }
}
