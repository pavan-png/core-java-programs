import java.util.ArrayList;
import java.util.function.Consumer;
class MyConsumer implements Consumer<String>{
    @Override
    public void accept(String s ) {
        System.out.println(s);
    }
}
public class Consumer_Apply_Method_Traditional_Approach {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("pavan");
        al.add("bought");
        al.add("a");
        al.add("villa");
        al.add("in");
        al.add("lotus");
        al.add("vijayawada");
        Consumer<String> obj = new MyConsumer();
        al.forEach(obj);
        // it is taking al data one by one , and by using accepting method we are printing it .
        // public void forEach(java.util.function.Consumer< ? super E>)  this method is available for all the collection classes


    }
}
