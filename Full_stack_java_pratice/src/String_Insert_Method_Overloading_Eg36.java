public class String_Insert_Method_Overloading_Eg36 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Helloworld");
        s.insert(5," pavan, ");
        System.out.println(s); // Hello pavan, world
        s.insert(5,1);
        System.out.println(s);

        // here return type of length is int (16) so no error .
        //  length gives the length of the string
        s.insert(s.length()," add me");
        System.out.println(s);

    }
}
