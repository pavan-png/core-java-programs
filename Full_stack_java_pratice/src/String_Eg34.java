public class String_Eg34 {
    public static void main(String[] args) {
        long x = 42L;
        long y = 44l;

        // if the first operation is String , all the remaining expression is  concatenated  ( " " in this case )
        System.out.println(" " +7 + 2 + " ");

        // here foo() return type is String , all the remaining expression is concatenated
        System.out.println(foo() + x + 5 + " ");

        // here first operation is  not string , so x and y are added normally and then concatenated with String foo
        System.out.println(x + y + foo() );
    }
    static String foo(){

        return "foo";
    }
}
