public class String_Eg85 {
    public static void main(String[] args) {

        // Creating a String with tab spaces using \t
        // \t represents a tab space between words
        String str = " my\tfavourite\tbike\tis\thusquvarna\tsvartpilen\t250 ";

        // strip()
        // Removes leading (starting) and trailing (ending) white spaces
        // It does NOT remove spaces or tabs inside the string
        // Available from Java (JDK) 11 onwards
        // Similar to trim(), but strip() also removes Unicode white spaces
        System.out.println(str.strip());
    }
}
