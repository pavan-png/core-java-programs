public class String_Eg87 {
    public static void main(String[] args) {

        // Creating three String variables
        String str1 = "1";
        String str2 = "22";
        String str3 = "333";

        // Step 1: str1.concat(str2)
        // "1" + "22" → "122"

        // Step 2: concat(str3)
        // "122" + "333" → "122333"

        // Step 3: repeat(3)
        // Repeats "122333" three times
        // Result: "122333122333122333"

        // Step 4: charAt(3)
        // Index starts from 0
        // 0 1 2 3 4 5 ...
        // 1 2 2 3 3 3 ...
        // Character at index 3 is '3'

        System.out.println(
                str1.concat(str2).concat(str3).repeat(3).charAt(3)
        );
        // Output: 3
    }
}
