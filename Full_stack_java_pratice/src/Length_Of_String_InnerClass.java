interface String_len{
    int st_len(String s);
}
public class Length_Of_String_InnerClass {
    public static void main(String[] args) {
        String_len obj = new String_len() {
            @Override
            public int st_len(String s) {
                int a = s.length();
                return a;
            }
        };
        System.out.println(obj.st_len("Hello there"));
    }
}
