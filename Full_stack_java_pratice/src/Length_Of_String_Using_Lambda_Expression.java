@FunctionalInterface
interface String_len_1{
    public int str_len(String s);
}
public class Length_Of_String_Using_Lambda_Expression {
    public static void main(String[] args) {
        String_len obj = s -> s.length();
        System.out.println( obj.st_len("Hello there"));
    }
}
