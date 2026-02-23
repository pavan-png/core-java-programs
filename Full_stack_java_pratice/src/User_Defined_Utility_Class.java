public final class User_Defined_Utility_Class {

    // Private constructor prevents object creation
    private User_Defined_Utility_Class() {
        throw new AssertionError("Cannot create object of Utility Class");
    }

    // Converts string to uppercase
    public static String returnUpperCase(String stringInput) {
        if (stringInput == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return stringInput.toUpperCase();
    }

    // Converts string to lowercase
    public static String returnLowerCase(String stringInput) {
        if (stringInput == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return stringInput.toLowerCase();
    }

    // Splits string based on given delimiter
    public static String[] splitStringInput(String stringInput, String delimiter) {
        if (stringInput == null || delimiter == null) {
            throw new IllegalArgumentException("Input string and delimiter cannot be null");
        }
        return stringInput.split(delimiter);
    }
}
