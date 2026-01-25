public class String_Eg75 {
    public static void main(String[] args) {

        // Array of strings
        String[] arr = {"1st", "2nd", "3rd", "4th", "5th"};

        // String to search in
        String place = "faraway";

        // indexOf('a', 3) means:
        // - start searching for character 'a'
        // - begin search from index 3 (0-based indexing)
        //
        // place = "f a r a w a y"
        // index    0 1 2 3 4 5 6
        //
        // Starting from index 3:
        // 'a' is found at index 3
        //
        // So place.indexOf('a', 3) returns 3
        //
        // arr[3] → "4th"
        System.out.println(arr[place.indexOf('a', 3)]);
    }
}
