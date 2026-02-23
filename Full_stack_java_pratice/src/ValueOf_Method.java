public class ValueOf_Method {
    public static void main(String[] args) {

        // 1️⃣ Creating Integer object from primitive value
        Integer i1 = Integer.valueOf(10);
        System.out.println("Primitive to Wrapper: " + i1);

        // 2️⃣ Creating Integer object from String (default base 10)
        Integer i2 = Integer.valueOf("10");
        System.out.println("String to Wrapper (base 10): " + i2);

        // 3️⃣ Creating Integer object from String with radix (base)

        // "1010" in binary (base 2)
        // = 1×2³ + 0×2² + 1×2¹ + 0×2⁰
        // = 8 + 0 + 2 + 0
        // = 10
        Integer i3 = Integer.valueOf("1010", 2);
        System.out.println("Binary 1010 (base 2) to decimal: " + i3);

        // "17" in octal (base 8)
        // = 1×8 + 7
        // = 15
        Integer i4 = Integer.valueOf("17", 8);
        System.out.println("Octal 17 (base 8) to decimal: " + i4);

        // "A" in hexadecimal (base 16)
        // A = 10
        Integer i5 = Integer.valueOf("A", 16);
        System.out.println("Hexadecimal A (base 16) to decimal: " + i5);

        // 4️⃣ Boolean.valueOf(String)
        // Returns true only if string equals "true" (ignoring case)
        // Otherwise returns false
        Boolean b1 = Boolean.valueOf("pavan");
        System.out.println("Boolean from String 'pavan': " + b1);

        // 5️⃣ This will throw NumberFormatException
        // Because "ten" is not a valid numeric string
        Integer i6 = Integer.valueOf("ten");
        System.out.println(i6);
    }
}