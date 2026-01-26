public class String_Eg127 {
    public static void main(String[] args) {

        // StringBuffer is MUTABLE
        // Initial content:
        // "One Two Three Four Five"
        StringBuffer sb = new StringBuffer("One Two Three Four Five");

        // reverse() reverses EVERY character of the SAME object
        // After reverse(), content becomes:
        // "eviF ruoF eerhT owT enO"
        //
        // indexOf("Two") searches for the exact sequence "Two"
        // Since the content is fully reversed, "Two" does NOT exist
        // Hence indexOf() returns -1
        System.out.println(sb.reverse().indexOf("Two")); // -1


        // Printing sb after reverse()
        // Shows the reversed content
        System.out.println(sb); // eviF ruoF eerhT owT enO


        // reverse() is called again on the SAME object
        // Reversing again brings the ORIGINAL string back
        // "One Two Three Four Five"
        //
        // indexOf("Two") now finds the substring
        // Index counting starts from 0
        // 'O'→0, 'n'→1, 'e'→2, ' '→3
        // 'T' of "Two" starts at index 4
        System.out.println(sb.reverse().indexOf("Two")); // 4


        // Printing sb again
        // Confirms original content is restored
        System.out.println(sb); // One Two Three Four Five
    }
}
