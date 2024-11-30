public class String_Eg32 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Helloworld");
        s.setCharAt(5,'W'); // available only for StringBuffer
        //
        // if a method doesn't return anything don't use it in the print statement.
        System.out.println(s);

    }
}
