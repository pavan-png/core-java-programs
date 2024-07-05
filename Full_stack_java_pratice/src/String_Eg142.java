public class String_Eg142 {
    public static void main(String[] args) {
        String str = "null";
        if (str == null)
            System.out.println("null");
       /*
       else (str.length() == 0){
        System.out.println("zero");
        }
        if condition need to be checked we should use "else-if". otherwise it leads to compile time error.

        */
        else
        {
            System.out.println("some");
        }
    }
}
