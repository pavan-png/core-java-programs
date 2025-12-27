public class Chained_Assignment_Eg1 {
    public static synchronized void main(String[] args) {

        int a, b, c, d;

        // Chained assignment:
        // a = b = c = d = 10;
        //
        // Assignment happens from RIGHT to LEFT:
        // Step 1: d = 10
        // Step 2: c = d  → 10
        // Step 3: b = c  → 10
        // Step 4: a = b  → 10
        a = b = c = d = 10;


        int e, f, g, h, i;

        // First assign a value to i
        i = 5;

        // Then perform chained assignment:
        // e = f = g = h = i;
        //
        // Again, assignment is RIGHT to LEFT:
        // h = i  → 5
        // g = h  → 5
        // f = g  → 5
        // e = f  → 5
        //
        // RULE:
        // In chained assignment, the LAST value on the right
        // must be a literal (ex: 10) or a variable that ALREADY has a value.
        e = f = g = h = i;


        // Here:
        // int j, k, l, m = 15;
        //
        // Only m gets 15.
        // j, k, l remain uninitialized.
        int j, k, l, m = 15;

        // (No chained assignment here, just declaration)
    }
}
