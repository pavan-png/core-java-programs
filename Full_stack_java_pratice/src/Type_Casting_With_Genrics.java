import java.util.ArrayList;
public class Type_Casting_With_Genrics {
    public static void main(String[] args) {
        ArrayList<String> al =new ArrayList<String>();
        al.add("pavan kalyan");
        String name =al.get(0);//type casting is not required as it is an TypeSafe

    }
}
