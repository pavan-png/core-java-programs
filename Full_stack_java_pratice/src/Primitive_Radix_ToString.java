public class Primitive_Radix_ToString {

    public static void main(String[] args) {

        int number = 31;

        // 🔷 Binary (base 2)
        String binary = Integer.toString(number, 2);
        System.out.println("Binary (base 2): " + binary);

        // 🔷 Octal (base 8)
        String octal = Integer.toString(number, 8);
        System.out.println("Octal (base 8): " + octal);

        // 🔷 Decimal (base 10)
        String decimal = Integer.toString(number, 10);
        System.out.println("Decimal (base 10): " + decimal);

        // 🔷 Hexadecimal (base 16)
        String hex = Integer.toString(number, 16);
        System.out.println("Hexadecimal (base 16): " + hex);

        // 🔷 Base 5
        String base5 = Integer.toString(number, 5);
        System.out.println("Base 5: " + base5);

        // 🔷 Base 36 (maximum supported radix)
        String base36 = Integer.toString(number, 36);
        System.out.println("Base 36: " + base36);

        /*
         Important Points:

         1. Radix range is from 2 to 36.
         2. 0-9 represent values 0 to 9.
         3. a-z represent values 10 to 35.
         4. This method converts decimal number to given base String.
        */
    }
}