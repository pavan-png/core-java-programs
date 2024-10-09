import java.util.ArrayList;

public class Non_Generic_Declaration {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<Integer>();
        /*
        the compiler will only check the type parameter at the l.h.s side , if it is not specified then it
        is treated as non generic .

         generics concept is applicable only at compiler level not at the runtime
         we dont have the concept of generics at the runtime
         */
        al.add("Hello");
        al.add("pavan");
        al.add("kalyan");

        ArrayList al1 = new ArrayList<String>();
        al1.add(25);
        al1.add(45.0);
        al1.add(78);


        ArrayList<String> al2 = new ArrayList();
        /*
        in the left side if the type parameter is specified and in the right side it is  not specified it
        is treated as generics only

        so since l.h.s side is taken as evaluation we can say that generics concept is applicable only at
        compile time
         */
        al2.add("generic");
        // al2.add(25);  C.E

    }
}
