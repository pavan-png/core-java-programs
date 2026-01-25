import java.util.Scanner;

public class Opposite_Case_Converting_Eg46 {
    public static void main(String[] args) {

        // Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Asking user to enter a mixed case string
        System.out.println("Enter the String (only alphabets and spaces)");

        // Reading the input string
        String s1 = sc.nextLine();

        // String to store the converted result
        String s2 = "";

        // Flag to track valid input
        boolean flag = true;

        // Loop through each character of the string
        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            // Case 1: lowercase letter → convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                s2 = s2 + (char) (ch - 32);
            }

            // Case 2: uppercase letter → convert to lowercase
            else if (ch >= 'A' && ch <= 'Z') {
                s2 = s2 + (char) (ch + 32);
            }

            // Case 3: space → keep as it is
            else if (ch == ' ') {
                s2 = s2 + ' ';
            }

            // Case 4: invalid input (numbers or symbols)
            else {
                flag = false;
                break;
            }
        }

        // If all characters are valid, print converted string
        if (flag) {
            System.out.println("Converted String : " + s2);
        }
        // Otherwise show warning
        else {
            System.out.println("Please enter only alphabet characters and spaces");
        }
    }
}
