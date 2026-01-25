import java.util.Scanner;

public class Word_Palindrome_Eg48 {
    public static void main(String[] args) {

        // Create Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.println("Enter the string");

        // Read the full line
        String input = sc.nextLine();

        // Split the string into words using space
        String[] words = input.split(" ");

        // Loop through each word
        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String reverse = "";

            // Reverse the current word
            for (int j = word.length() - 1; j >= 0; j--) {
                reverse = reverse + word.charAt(j);
            }

            // Check palindrome
            if (word.equals(reverse)) {
                System.out.println("Word \"" + word + "\" is a palindrome");
            } else {
                System.out.println("Word \"" + word + "\" is not a palindrome");
            }
        }
    }
}
