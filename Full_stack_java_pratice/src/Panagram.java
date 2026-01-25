public class Panagram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(input));
    }

    public static boolean isPangram(String str) {

        // 1. Convert to lowercase so 'A' and 'a' are treated the same
        str = str.toLowerCase();

        // 2. Loop through every letter of the alphabet (a to z)
        for (char c = 'a'; c <= 'z'; c++) {

            // 3. indexOf(c) checks whether the character exists in the string
            //    If the character is NOT found, indexOf() returns -1
            if (str.indexOf(c) == -1) {

                // 4. If any alphabet letter is missing,
                //    the string is NOT a pangram
                return false;
            }
        }

        // 5. If all 26 letters are found,
        //    the string IS a pangram
        return true;
    }
}
