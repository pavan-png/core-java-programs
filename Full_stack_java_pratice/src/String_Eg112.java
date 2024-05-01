public class String_Eg112 {
    public static void main(String[] args) {
        String[] str = "hello_pavan_how_are_you".split("_",3);

        // the above code can be written as this  below two lines code also
        String str1 = "hello_guru_how_are_you";
        String[] st = str1.split("_");

        for( String s :str ){
            System.out.println(s);
        }
    }
}
