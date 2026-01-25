import java.util.Scanner;

public class Capital_String_Eg44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String s1 = sc.nextLine();
        String s2 = "";
        boolean flag = true;

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            // Case 1: lowercase letter → convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                s2 = s2 + (char) (ch - 32);
            }

            // Case 2: uppercase letter → keep as it is
            else if (ch >= 'A' && ch <= 'Z') {
                s2 = s2 + ch;
            }

            // Case 3: space → keep as it is
            else if (ch == ' ') {
                s2 = s2 + ' ';
            }

            // Case 4: invalid input (digits or symbols)
            else {
                System.out.println("Please enter only alphabet characters");
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("The original String is : " + s1);
            System.out.println("Converted to : " + s2);
        }
    }
}
