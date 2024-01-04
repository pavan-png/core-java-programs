import java.util.ArrayList;
import java.util.List;

public class Static_Block_Eg1 {
   static  List<String> list;
    Static_Block_Eg1(){
        list.add("friday");
        list.add("saturday");
        list.add("sunday");
        System.out.println("constructor block");
    }
    public void display(){
        System.out.println(list);
    }
    static {
        list = new ArrayList<String>();
        list.add("monday");
        list.add("tuesday");
        list.add("wednesday");
        list.add("thursday");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Static_Block_Eg1 obj = new Static_Block_Eg1();
        obj.display();
    }
}
