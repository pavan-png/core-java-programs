import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "a gentle man";
        String s2 = "elegant man";

        // 1. Remove spaces and convert to lowercase
        //    (Anagram check should ignore spaces and case)
        char[] a = s1.replace(" ", "").toLowerCase().toCharArray();
        char[] b = s2.replace(" ", "").toLowerCase().toCharArray();

        // 2. Sort both character arrays
        //    Same characters will come in same order if they are anagrams
        Arrays.sort(a);
        Arrays.sort(b);

        // 3. Compare sorted arrays
        //    Arrays.equals() compares content, not reference
        System.out.println(Arrays.equals(a, b) ? "anagram" : "not an anagram");
    }
}
