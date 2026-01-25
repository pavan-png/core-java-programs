public class StringBuffer_Append {
    public static void main(String[] args) {

        // Creating an empty StringBuffer object
        StringBuffer s = new StringBuffer();

        // Appending a String to the StringBuffer
        s.append("Iam working in google with a package of ");

        // Appending a double value
        // Java automatically converts 45.50 into String "45.5"
        s.append(45.50);

        // Appending another String
        s.append(" L.P.A");

        // Appending one more String
        s.append(" In ");

        // Printing the current content of StringBuffer
        System.out.println(s);
        // Output:
        // Iam working in google with a package of 45.5 L.P.A In

        // append(String str, int start, int end)
        // Appends a portion of the given String
        // start index is inclusive, end index is exclusive
        // From "Newyork", characters from index 0 to 3 are appended ("New")
        s.append("Newyork", 0, 4);

        // Printing the updated content
        System.out.println(s);
        // Output:
        // Iam working in google with a package of 45.5 L.P.A In New
    }
}
