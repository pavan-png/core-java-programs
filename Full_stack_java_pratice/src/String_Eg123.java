public class String_Eg123 {
    public static void main(String[] args) {

        // delimiter attaches the character after every element.
        System.out.println( String.join("_","1","2","3").concat(",").repeat(3).lastIndexOf(',') );
        // index starts from 0
    }
}
