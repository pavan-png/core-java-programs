public class String_Builder_Eg3 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello");

        /*
          StringBuilder s2 = " Hey "        cannot declare String builder  like this
        */

        s1.append(" everyone ");
        System.out.println(s1);


    }
}
