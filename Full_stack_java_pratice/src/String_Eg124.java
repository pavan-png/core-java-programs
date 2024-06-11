public class String_Eg124 {
    public static void main(String[] args) {
        String str1 = "OnE tWO ThReE FoUr";
        String str2 = "ONeTWothReefoUR";

        // trim() method only remove the spaces at beginning and at the ending.
        System.out.println(str1.trim().equalsIgnoreCase(str2));
    }
}
