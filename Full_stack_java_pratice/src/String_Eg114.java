public class String_Eg114 {
    public static void main(String[] args) {

        // Original String object
        String str = "Four Wheels";

        // replace('s','S') is a String method
        // It does NOT modify the existing string (String is immutable)
        // A NEW String object is created with 's' replaced by 'S'
        // Resulting string becomes: "Four WheelS"
        String result = str.replace('s', 'S');

        // indexOf('s') searches for lowercase 's'
        // Since 's' was replaced with uppercase 'S',
        // lowercase 's' is NOT present in the new string
        // Hence indexOf() returns -1
        System.out.println(result.indexOf('s'));   // -1
    }
}
