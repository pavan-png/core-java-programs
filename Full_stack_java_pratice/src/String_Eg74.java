public class String_Eg74 {
    public static void main(String[] args) {

        // StringBuilder is MUTABLE
        // Initial content is "B"
        StringBuilder sb = new StringBuilder("B");

        // This line is evaluated from INSIDE to OUTSIDE
        // Step 1: sb.append("A")
        //         → modifies sb itself
        //         → sb becomes "BA"
        //         → returns the SAME sb reference
        //
        // Step 2: sb.append(sb)
        //         → now sb is "BA"
        //         → appending sb to itself
        //         → "BA" + "BA" = "BABA"
        sb.append(sb.append("A"));

        // Prints the final content of sb
        System.out.println(sb);
    }
}
