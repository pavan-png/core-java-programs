public class String_Eg111 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HELLO");

        // replace method cannot be done on StringBuilder  it is the method of String.
        // here method  evaluation is done from left .
        //    System.out.println(sb.reverse().replace("O","A"));
    }
}
