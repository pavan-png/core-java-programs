import java.util.Scanner;

public class SmallerCase_String_Eg45 {
    public static void main(String[] args) {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Asking user to enter a string
        System.out.println("Enter the string (alphabets only)");

        // Reading the full input line
        String s = sc.nextLine();

        // String to store the final converted result
        String s1 = "";

        // Flag to track valid input
        boolean flag = true;

        // Loop through each character of the input string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Case 1: lowercase letter → keep as it is
            if (ch >= 'a' && ch <= 'z') {
                s1 = s1 + ch;
            }

            // Case 2: uppercase letter → convert to lowercase using ASCII
            else if (ch >= 'A' && ch <= 'Z') {
                // 'A' = 65, 'a' = 97 → difference = 32
                s1 = s1 + (char) (ch + 32);
            }

            // Case 3: space → keep as it is
            else if (ch == ' ') {
                s1 = s1 + ' ';
            }

            // Case 4: invalid input (numbers or symbols)
            else {
                System.out.println("Please enter only alphabet characters");
                flag = false;
                break;
            }
        }

        // Print result only if input is valid
        if (flag) {
            System.out.println("Original string is : " + s);
            System.out.println("Converted to lower case : " + s1);
        }
    }
}
