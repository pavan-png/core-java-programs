public class String_Eg22 {
    public static void main(String[] args) {

        // Creating a String literal with NO leading or trailing spaces
        String s = "pavan kalyan";

        // Printing the original string
        System.out.println("String is :" + s);

        // length() returns the total number of characters in the string
        // This includes letters and spaces inside the string
        System.out.println("length before trim " + s.length());

        // trim() removes ONLY leading and trailing spaces
        // It returns a NEW String
        // Since there are no extra spaces at the beginning or end,
        // the length remains the same
        String s1 = s.trim();

        System.out.println("length after trim " + s1.length());

        // Just a separator line for clarity
        System.out.println("======================================================================");

        // Creating a String literal WITH leading and trailing spaces
        String s2 = "  Hello world  ";

        // Printing the original string (spaces are present but not clearly visible)
        System.out.println("String is  :" + s2);

        // length() counts ALL characters including leading and trailing spaces
        System.out.println("length before trim " + s2.length());

        // trim() removes spaces from the START and END of the string
        // Spaces between words are NOT removed
        // A new String without extra spaces is created
        String s3 = s2.trim();

        // Printing the length after removing leading and trailing spaces
        System.out.println("length after trim " + s3.length());
    }
}
