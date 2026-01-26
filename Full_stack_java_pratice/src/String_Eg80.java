public class String_Eg80 {
    public static void main(String[] args) {

        // Creating a String variable
        String name = "pavankalyan";

        // substring(int beginIndex)
        // Starts from index 4 and goes till the end of the string
        // Indexing starts from 0
        // p a v a n k a l y a n
        // 0 1 2 3 4 5 6 7 8 9 10
        // Result: "nkalyan"
        System.out.println(name.substring(4));

        // substring(int beginIndex, int endIndex)
        // Starts from index 2
        // Ends at index 8 - 1 (endIndex is excluded)
        // Characters taken: index 2 to 7
        // Result: "vankal"
        System.out.println(name.substring(2, 8));
    }
}
