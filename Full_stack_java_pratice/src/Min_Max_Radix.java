public class Min_Max_Radix {

    public static void main(String[] args) {

        // Character.MIN_RADIX defines the smallest base (number system)
        // that Java allows for methods like:
        // Integer.valueOf(String, radix)
        // Integer.parseInt(String, radix)

        // Minimum supported base is 2 (binary number system)
        System.out.println("Minimum Radix: " + Character.MIN_RADIX);


        // Character.MAX_RADIX defines the largest base
        // that Java allows for conversion methods

        // Maximum supported base is 36
        // Because Java allows digits:
        // 0-9  (10 digits)
        // a-z  (26 letters)
        // Total = 36 possible symbols

        System.out.println("Maximum Radix: " + Character.MAX_RADIX);


        // So whenever we use:
        // Integer.valueOf("number", radix)
        // The radix must be between 2 and 36.
    }
}