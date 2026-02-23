public class Parse_Method_Radix {

    public static void main(String[] args) {

        // 🔷 Binary (base 2)
        // 111 (base 2)
        // = 1×2² + 1×2¹ + 1×2⁰
        // = 4 + 2 + 1
        // = 7
        int binaryValue = Integer.parseInt("111", 2);
        System.out.println("Binary 111 (base 2): " + binaryValue);


        // 🔷 Octal (base 8)
        // 17 (base 8)
        // = 1×8 + 7
        // = 15
        int octalValue = Integer.parseInt("17", 8);
        System.out.println("Octal 17 (base 8): " + octalValue);


        // 🔷 Decimal (base 10)
        // 123 (base 10)
        int decimalValue = Integer.parseInt("123", 10);
        System.out.println("Decimal 123 (base 10): " + decimalValue);


        // 🔷 Hexadecimal (base 16)
        // A = 10
        int hexValue = Integer.parseInt("A", 16);
        System.out.println("Hexadecimal A (base 16): " + hexValue);


        // 🔷 Base 36 (0–9, a–z)
        // Z = 35
        int base36Value = Integer.parseInt("Z", 36);
        System.out.println("Base 36 Z: " + base36Value);


        // 🔷 Another example
        // "10" in base 5
        // = 1×5 + 0
        // = 5
        int base5Value = Integer.parseInt("10", 5);
        System.out.println("Base 5 (10): " + base5Value);


        // If radix is outside 2 to 36
        // NumberFormatException will occur
        // Example:
        // Integer.parseInt("10", 1);  // Invalid
    }
}