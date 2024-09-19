import java.util.ArrayList;

public class Concurrent_Modification_Using_For_Loop {
    public static void main(String[] args) {
            ArrayList al = new ArrayList();
            al.add(25);
            al.add(78);
            al.add(10);
            al.add(87);
            al.add(50);

            // using for loop you can  traverse only collections which are index based.
            System.out.println("using for loop");
            for (int i = 0 ; i<al.size();i++){
                System.out.print(al.get(i)+ "   "); // get method is used to access the elements
                al.add(10);
            }
    }
}
