import java.util.ArrayList;
public class Type_Casting_Collection_During_Retrival {
    public static void main(String[] args) {
        ArrayList al =new ArrayList();
        al.add("pavan");
        al.add("kalyan");
      //  String name1 = al.get(0); CE: incompatible types: found: java.lang.Object required: java.lang.String
        String name1 =  (String) al.get(0);//At the time of retrieval type casting is mandatory

    }
}
