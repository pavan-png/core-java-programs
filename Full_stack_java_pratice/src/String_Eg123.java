public class String_Eg123 {
    public static void main(String[] args) {

        // String.join("_","1","2","3")
        // Joins the given elements using "_" as delimiter
        // Result → "1_2_3"

        // concat(",")
        // Adds comma at the end
        // New String created → "1_2_3,"

        // repeat(3)
        // Repeats the entire string 3 times
        // Result → "1_2_3,1_2_3,1_2_3,"

        // lastIndexOf(',')
        // Searches for the LAST occurrence of comma
        // Index counting starts from 0
        // Returns the index position of the last comma character
        System.out.println(
                String.join("_","1","2","3")
                        .concat(",")
                        .repeat(3)
                        .lastIndexOf(',')
        );
    }
}
