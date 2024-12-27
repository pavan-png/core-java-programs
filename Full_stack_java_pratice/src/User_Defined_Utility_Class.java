public final class User_Defined_Utility_Class {

    private User_Defined_Utility_Class(){}

    public static String returnUpperCase(String stringInput) {
        return stringInput.toUpperCase();
    }

    public static String returnLowerCase(String stringInput) {
        return stringInput.toLowerCase();
    }

    public static String[] splitStringInput(String stringInput, String delimiter) {
        return stringInput.split(delimiter);
    }

}