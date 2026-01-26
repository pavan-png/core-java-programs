public class String_Eg112 {
    public static void main(String[] args) {

        // split("_", 3) divides the string based on "_" delimiter
        // 3 is the LIMIT → it controls how many parts the result array can have
        // Maximum array size will be 3
        // First (limit - 1) splits happen normally
        // Remaining string is stored as the last element without further splitting
        String[] str = "hello_pavan_how_are_you".split("_", 3);

        // The above split works like this:
        // "hello"  → first part
        // "pavan"  → second part
        // "how_are_you" → remaining part (no further split because limit reached)

        // split("_") without limit
        // Default limit = 0
        // It splits the string at ALL occurrences of "_"
        String str1 = "hello_guru_how_are_you";
        String[] st = str1.split("_");

        // The above split works like this:
        // "hello", "guru", "how", "are", "you"

        // Enhanced for loop to iterate through the 'str' array
        // It prints each element produced by split("_", 3)
        for (String s : str) {
            System.out.println(s);
        }
    }
}
