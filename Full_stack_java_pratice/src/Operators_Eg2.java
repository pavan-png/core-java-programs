public class Operators_Eg2 {
    public static void main(String[] args) {

        int a = 8, b = 15, c = 4;

        /*
         Expression:
         -----------
         2 * ((a % 5) * (4 + (b - 3) / (c + 2)))

         Rule:
         -----
         Evaluation happens based on:
         1) Parentheses
         2) Arithmetic operator precedence
         3) Left-to-right associativity (for same precedence)

         Step-by-step evaluation:
         ------------------------
         a % 5        → 8 % 5  → 3

         (b - 3)      → 15 - 3 → 12
         (c + 2)      → 4 + 2  → 6
         (b - 3)/(c+2)→ 12 / 6 → 2   (integer division)

         4 + 2        → 6

         (a % 5) * 6  → 3 * 6  → 18

         2 * 18       → 36
        */
        System.out.println(2 * ((a % 5) * (4 + (b - 3) / (c + 2))));
    }
}
