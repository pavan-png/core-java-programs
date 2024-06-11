public class String_Eg113 {
    public static void main(String[] args) {
        String str = " ";

        // blank is a special character so true
        System.out.println(str.isBlank());

        // since blank is there it is no empty
        System.out.println(str.isEmpty());
    }
}
