public class String_Eg124 {
    public static void main(String[] args) {

        // String with spaces between words and mixed case letters
        String str1 = "OnE tWO ThReE FoUr";

        // String without spaces and with mixed case letters
        String str2 = "ONeTWothReefoUR";

        // trim() removes ONLY leading and trailing spaces
        // It does NOT remove spaces in between words
        // In this case, str1 has NO leading or trailing spaces
        // So trim() does NOT change str1
        String trimmedStr1 = str1.trim();

        // equalsIgnoreCase() compares CONTENT ignoring case
        // It does NOT ignore spaces
        // Since str1 still contains spaces and str2 does not,
        // both strings are NOT equal
        System.out.println(trimmedStr1.equalsIgnoreCase(str2));  // false
    }
}
