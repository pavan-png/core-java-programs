public class String_Eg107 {
    public static void main(String[] args) {
        String str = "PANIC";
        StringBuilder sb = new StringBuilder("THET");

        // operation is performed on String object  where 'N' of String Object is replaced with StringBuilder object
        System.out.println(str.replace("N",sb) /* .getClass()   */    );

    }
}
