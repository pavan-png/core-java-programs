public class String_Eg91 {
    public static void main(String[] args) {

        // for loop starts with i = 5
        // Loop runs as long as i is greater than or equal to 1
        // After each iteration, i is decremented by 1
        for (int i = 5; i >= 1; i--) {

            // "*".repeat(i)
            // Repeats the "*" character i number of times
            // When i = 5 → "*****"
            // When i = 4 → "****"
            // When i = 3 → "***"
            // When i = 2 → "**"
            // When i = 1 → "*"
            System.out.println("*".repeat(i));
        }
    }
}
