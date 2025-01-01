public class Boolean_Constructors {
    public static void main(String[] args) {
        Boolean b1= new Boolean(true);
        System.out.println("b1  :" +b1);
        Boolean b2 = new Boolean(false);
        System.out.println("b2  :"+b2);

        /*  Boolean b3 = new Boolean(True);
        System.out.println(b3);
        Boolean b4 = new Boolean(False);
        System.out.println(b4);
        Boolean b5 = new Boolean(TRUE);
        System.out.println(b5);
        */

        // String input => case is not important, content is important.

        Boolean b6 = new Boolean("true");
        System.out.println("b6  :"+b6);
        Boolean b7 = new Boolean("True");
        System.out.println("b7  :"+b7);
        Boolean b8 = new Boolean("false");
        System.out.println("b8  :"+b8);
        Boolean b9 = new Boolean("False");
        System.out.println("b9  :"+b9);
        Boolean b10 = new Boolean("pavan");
        System.out.println("b10  :"+b10);
        Boolean b11 = new Boolean("TRUE");
        System.out.println("b11  :"+b11);

        Boolean b12 = new Boolean("yes");
        System.out.println("b12  :"+b12);

        Boolean b13 = new Boolean("no");
        System.out.println("b13  :"+b13);

        System.out.println(b12.equals(b13)); // false.equals(false)  compares the content.
        System.out.println(b12==b13); // compare the reference.



    }
}
