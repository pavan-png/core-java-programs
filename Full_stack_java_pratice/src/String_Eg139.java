public class String_Eg139 {
    public static void main(String[] args) {
        String string = "JAVA";
        StringBuffer sbuffer = new StringBuffer(string);
        StringBuilder sBuilder = new StringBuilder(string);
        System.out.println(string.equals(sbuffer));
        // on a string object if you are working both of them should be string otherwise false
        System.out.println(string.equals(sBuilder));


        System.out.println(sbuffer.equals(sBuilder));
        // here we are taking string buffer , it will compare the reference of the sbuffer and sBUilder since both of them
        // is not same result is false.

    }
}
